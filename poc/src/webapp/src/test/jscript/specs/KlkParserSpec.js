describe("KlkParser", function() {
	describe("When loading list of candidates", function() {
	
		it("should return number of candidates", function() {
			var parser = OpenPKW.KlkParser
			var candidates = parser.loadCandidates(klk_xml);
			expect(candidates.length).toBe(10);
		});

		it("should return position of a candidate on a list", function() {
			var parser = OpenPKW.KlkParser
			var candidates = parser.loadCandidates(klk_xml);
			expect(candidates[3].positionOnList).toBe(4);
		});

		it("should return first name of a candidate", function() {
			var parser = OpenPKW.KlkParser
			var candidates = parser.loadCandidates(klk_xml);
			expect(candidates[3].firstName).toBe("Janusz Ryszard");
		});

		it("should return last name of a candidate", function() {
			var parser = OpenPKW.KlkParser
			var candidates = parser.loadCandidates(klk_xml);
			expect(candidates[3].lastName).toBe("KORWIN-MIKKE");
		});
	})

	describe("When loading polling stations data", function() {
		it ("should return list of all polling stations", function() {
			var parser = OpenPKW.KlkParser
			var pollingStationsData = parser.loadPollingStationsData($.parseXML(klk_xml));
			expect(pollingStationsData.length).toBe(397);
		});
	});

	describe("When loading single polling station data", function() {
		it ("should return the community code", function () {
			var parser= OpenPKW.KlkParser
			var pollingStationsData = parser.loadPollingStationsData($.parseXML(klk_xml));
			expect(pollingStationsData[2].kodGminy).toBe("106101");
		});

		it ("should return the circuit number", function () {
			var parser= OpenPKW.KlkParser
			var pollingStationsData = parser.loadPollingStationsData($.parseXML(klk_xml));
			expect(pollingStationsData[2].nrObwodu).toBe("3");
		});

		it ("should return the circuit location", function () {
			var parser= OpenPKW.KlkParser
			var pollingStationsData = parser.loadPollingStationsData($.parseXML(klk_xml));
			expect(pollingStationsData[2].siedzibaKomisjiObwodowej).toBe("Świetlica OSP, ul. Plonowa 18");
		});		
	})
});