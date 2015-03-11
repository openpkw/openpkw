var OpenPKW = OpenPKW || {};

var pollingStationsData;
var geographyTaxonomy;

$(document).ready(function() {

	loadGeographyTaxonomy();
	loadPollingStationsData();

	$("#loadDataButton").on("click", function( event ) {
		// Wczytanie pliku KLK
	});

	$("#wyborOKW").on("change", function(event) {
		updatePollingStationData();
	});

	$("#wyborWojewodztwa").on("change", function(event) {
		fillDistricts();
	});

	$("#wyborPowiatu").on("change", function(event) {
		fillCommunities();
	})
});

function fillCandidates(candidates) {
	$(candidates).each(function(index) {
		var positionOnList = this.positionOnList;
		var firstName = this.firstName;
		var lastName = this.lastName;
		var textFieldId = "#kandydat_"+positionOnList+"_imiona_i_nazwisko";
		$(textFieldId).val(firstName+" "+lastName);
	});
}

function loadPollingStationsData() {
	$.ajax({
		type: "GET",
		url: "106101.xml",
		dataType: "xml",
		success: function (xml) {
			var candidates = OpenPKW.KlkParser.loadCandidates(xml);
			fillCandidates(candidates);
			pollingStationsData = OpenPKW.KlkParser.loadPollingStationsData(xml);
			fillPollingStationsData(pollingStationsData);
		}
	});
}

function fillPollingStationsData(pollingStationsData) {
	var adresOKW = $('#wyborOKW');
	$.each(pollingStationsData, function(idx, pollingStationData) {
    	adresOKW.append(
	        $('<option></option>').val(idx).html("Obwód nr "+pollingStationData.nrObwodu+": "+pollingStationData.siedzibaKomisjiObwodowej)
	    );
	});

	var pollingStationData = pollingStationsData[0];
	$("#kodGminy").val(pollingStationData.kodGminy);
	$("#nrObwodu").val(pollingStationData.nrObwodu);
	$("#adresOKW").val(pollingStationData.siedzibaKomisjiObwodowej);
	$("#gmina").val(pollingStationData.gmina);
	$("#powiat").val(pollingStationData.powiat);
	$("#wojewodztwo").val(pollingStationData.wojewodztwo);
	$("#nrKomisji").val(pollingStationData.numerKomisjiOkregowej);
	$("#miejsceOKW").val(pollingStationData.siedzibaKomisjiOkregowej);
	$("#liczbaWyborcow").val(pollingStationData.liczbaWyborcow);
}

function updatePollingStationData() {
	var idx = $("#wyborOKW").find("option:selected").val();
	var pollingStationData = pollingStationsData[idx];
	$("#kodGminy").val(pollingStationData.kodGminy);
	$("#nrObwodu").val(pollingStationData.nrObwodu);
	$("#adresOKW").val(pollingStationData.siedzibaKomisjiObwodowej);
	$("#liczbaWyborcow").val(pollingStationData.liczbaWyborcow);
}

function loadGeographyTaxonomy() {
	$.ajax({
		type: "GET",
		url: "teryt.json",
		dataType: "json",
		success: function (json) {
			geographyTaxonomy = json;
			fillVoivodships();
		}
	});
}

function fillVoivodships() {
	var wyborWojewodztwa = $("#wyborWojewodztwa");
	wyborWojewodztwa.empty();
	$.each(geographyTaxonomy, function(idx, voivodship) {
    	wyborWojewodztwa.append(
	        $('<option></option>').val(idx).html(voivodship.name)
	    );
	});
	fillDistricts();
}

function fillDistricts() {
	var voivodshipIdx = $("#wyborWojewodztwa").find("option:selected").val();
	var districts = geographyTaxonomy[voivodshipIdx].children;
	var wyborPowiatu = $("#wyborPowiatu");
	wyborPowiatu.empty();
	$.each(districts, function(idx, district) {
    	wyborPowiatu.append(
	        $('<option></option>').val(idx).html(district.name+" ("+district.type+")")
	    );
	});
	fillCommunities();
}

function fillCommunities() {
	var voivodshipIdx = $("#wyborWojewodztwa").find("option:selected").val();
	var districtIdx = $("#wyborPowiatu").find("option:selected").val();
	var districts = geographyTaxonomy[voivodshipIdx].children;
	var communities = districts[districtIdx].children;

	var wyborGminy = $("#wyborGminy");
	wyborGminy.empty();
	$.each(communities, function(idx, community) {
    	wyborGminy.append(
	        $('<option></option>').val(idx).html(community.name+" ("+community.type+")")
	    );
	});
}