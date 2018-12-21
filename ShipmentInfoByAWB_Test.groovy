package contracts.com.fedex.k2.common.contract

import org.springframework.cloud.contract.spec.Contract
import groovy.json.JsonSlurper

Contract.make {
	description(" Should return JSON object with Shipment Information ")
	request {
		method 'GET'
		url '/api/v1/k2/shipment-info/awb/12345678'
	}
	response {
		status 200
		headers {
			header 'Content-Type': 'application/json;charset=UTF-8'
		}
		body ($(consumer(file("ShipmentInfoByAWB_Response.json"))),$(producer(execute('assertShipmentInfoByAWBResponse($it)'))))
	}
}