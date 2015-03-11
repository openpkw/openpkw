function formatXml(xml) {
	var formatted = '';
	var reg = /(>)(<)(\/*)/g;
	xml = xml.replace(reg, '$1\r\n$2$3');
	var pad = 0;
	jQuery.each(xml.split('\r\n'), function(index, node) {
	var indent = 0;
	if (node.match( /.+<\/\w[^>]*>$/ )) {
		indent = 0;
		} else if (node.match( /^<\/\w/ )) {
			if (pad != 0) {
		pad -= 1;
		}
	} else if (node.match( /^<\w[^>]*[^\/]>.*$/ )) {
		indent = 1;
	} else {
		indent = 0;
	}
 
	var padding = '';
	for (var i = 0; i < pad; i++) {
		padding += ' ';
	}
 
	formatted += padding + node + '\r\n';
		pad += indent;
	});
 
	return formatted;
} 


function appendTextNode(doc, parentNode, nodeName, nodeValue) {
	var element = doc.createElement(nodeName);
	var value = doc.createTextNode(nodeValue);
	parentNode.appendChild(element);
	element.appendChild(value);
	return element;
}

function send() {
	var doc = document.implementation.createDocument(null, "save", null);

	var stepElement = doc.createElement("step");
	var stepValue = doc.createTextNode("0");
	stepElement.appendChild(stepValue);
	doc.documentElement.appendChild(stepElement);

	var headerElement = doc.createElement("header");
	doc.documentElement.appendChild(headerElement);

	appendTextNode(doc, headerElement, "id_instytucji", "lasjdflaksjdflasdkf");
	appendTextNode(doc, headerElement, "id_okregu", ">d08e6eeac932e8796a5871dff2718a2c");

	// reszta nagłówka

	var formElement = doc.createElement("form");
	doc.documentElement.appendChild(formElement);
	appendTextNode(doc, formElement, "field_1_1", "1653");
	appendTextNode(doc, formElement, "field_1_2", "1165");

	var komisjaSklad = doc.createElement("komisja_sklad");
	doc.documentElement.appendChild(komisjaSklad);

	var serializer = new XMLSerializer();
	var xml = serializer.serializeToString(doc);
	alert(formatXml(xml));
}