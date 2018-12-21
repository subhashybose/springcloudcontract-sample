package com.fedex.k2.common.contract;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.fedex.k2.common.controller.CommonController;

import io.restassured.module.mockmvc.RestAssuredMockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest
public abstract class BaseContractTest {
	@Autowired
	CommonController commonController;

	@Before
	public void setup() {
		RestAssuredMockMvc.standaloneSetup(commonController);
	}

	public void assertShipmentInfoByAWBResponse(Object resp) throws JSONException {

		JSONArray respJsonArr = new JSONArray(resp.toString());
		int len = respJsonArr.length();
		for (int i = 0; i < len; i++) {
			final JSONObject jsonObj = respJsonArr.getJSONObject(i);

			if (!jsonObj.has("awbDetails")) {
				throwException("", "awbDetails");
			}

			JSONObject awbDetailsObj = jsonObj.getJSONObject("awbDetails");

			if (!awbDetailsObj.has("shipmentSeqNumber")) {
				throwException("awbDetails", "shipmentSeqNumber");
			}
			if (!awbDetailsObj.has("awbNumber")) {
				throwException("awbDetails", "awbNumber");
			}
			if (!awbDetailsObj.has("carrierCode")) {
				throwException("awbDetails", "carrierCode");
			}
			if (!awbDetailsObj.has("productType")) {
				throwException("awbDetails", "productType");
			}
			if (!awbDetailsObj.has("receiverInitialCode")) {
				throwException("awbDetails", "receiverInitialCode");
			}
			if (!awbDetailsObj.has("originCityCode")) {
				throwException("awbDetails", "originCityCode");
			}
			if (!awbDetailsObj.has("destinationCityCode")) {
				throwException("awbDetails", "destinationCityCode");
			}
			if (!awbDetailsObj.has("createDate")) {
				throwException("awbDetails", "createDate");
			}
			if (!awbDetailsObj.has("executeDate")) {
				throwException("awbDetails", "executeDate");
			}
			if (!awbDetailsObj.has("receiptDate")) {
				throwException("awbDetails", "receiptDate");
			}
			if (!awbDetailsObj.has("currencyCode")) {
				throwException("awbDetails", "currencyCode");
			}
			if (!awbDetailsObj.has("afiType")) {
				throwException("awbDetails", "afiType");
			}
			if (!awbDetailsObj.has("fdxOrigin")) {
				throwException("awbDetails", "fdxOrigin");
			}
			if (!awbDetailsObj.has("fdxDestination")) {
				throwException("awbDetails", "fdxDestination");
			}
			if (!awbDetailsObj.has("totalChargeableWgtLB")) {
				throwException("awbDetails", "totalChargeableWgtLB");
			}
			if (!awbDetailsObj.has("totalShpQty")) {
				throwException("awbDetails", "totalShpQty");
			}
			if (!awbDetailsObj.has("totalShipWgtLB")) {
				throwException("awbDetails", "totalShipWgtLB");
			}
			if (!awbDetailsObj.has("chargeWgtLB")) {
				throwException("awbDetails", "chargeWgtLB");
			}
			if (!awbDetailsObj.has("otherChrgCollectCd")) {
				throwException("awbDetails", "otherChrgCollectCd");
			}
			if (!awbDetailsObj.has("wgtValChrgSeqCd")) {
				throwException("awbDetails", "wgtValChrgSeqCd");
			}
			if (!awbDetailsObj.has("otherChrgPrePayCd")) {
				throwException("awbDetails", "otherChrgPrePayCd");
			}
			if (!awbDetailsObj.has("chargeTypeCd")) {
				throwException("awbDetails", "chargeTypeCd");
			}
			if (!awbDetailsObj.has("afiTWC")) {
				throwException("awbDetails", "afiTWC");
			}

			if (!jsonObj.has("awbSplitList")) {
				throwException("", "awbSplitList");
			}

			if (!jsonObj.has("shipmentDelivery")) {
				throwException("", "shipmentDelivery");
			}

			if (!jsonObj.isNull("shipmentDelivery")) {
				JSONArray shipmentDelArr = jsonObj.getJSONArray("shipmentDelivery");

				if (shipmentDelArr != null && shipmentDelArr.length() > 0) {
					for (int k = 0; k < shipmentDelArr.length(); k++) {
						JSONObject shipmentDeliveryObj = shipmentDelArr.getJSONObject(k);
						if (shipmentDeliveryObj != null) {
							if (!shipmentDeliveryObj.has("deliveryAgentCode")) {
								throwException("shipmentDelivery", "deliveryAgentCode");
							}
							if (!shipmentDeliveryObj.has("deliveryModeCode")) {
								throwException("shipmentDelivery", "deliveryModeCode");
							}
							if (!shipmentDeliveryObj.has("deliveryDate")) {
								throwException("shipmentDelivery", "deliveryDate");
							}
							if (!shipmentDeliveryObj.has("deliveredQty")) {
								throwException("shipmentDelivery", "deliveredQty");
							}
						}
					}
				}
			}

			if (!jsonObj.has("shipmentParty")) {
				throwException("", "shipmentParty");
			}

			if (!jsonObj.isNull("shipmentParty")) {
				JSONArray shipmentPartyArr = jsonObj.getJSONArray("shipmentParty");

				if (shipmentPartyArr != null && shipmentPartyArr.length() > 0) {
					for (int k = 0; k < shipmentPartyArr.length(); k++) {
						JSONObject shipmentPartyObj = shipmentPartyArr.getJSONObject(k);
						if (shipmentPartyObj != null) {
							if (!shipmentPartyObj.has("partyRoleNumber")) {
								throwException("shipmentParty", "partyRoleNumber");
							}
							if (!shipmentPartyObj.has("corpAccountNumber")) {
								throwException("shipmentParty", "corpAccountNumber");
							}
							if (!shipmentPartyObj.has("partyName")) {
								throwException("shipmentParty", "partyName");
							}
							if (!shipmentPartyObj.has("businessModeCode")) {
								throwException("shipmentParty", "businessModeCode");
							}
							if (!shipmentPartyObj.has("partyIATACode")) {
								throwException("shipmentParty", "partyIATACode");
							}
							if (!shipmentPartyObj.has("contactNumber")) {
								throwException("shipmentParty", "contactNumber");
							}
							if (!shipmentPartyObj.has("address")) {
								throwException("shipmentParty", "address");
							}
							if (!shipmentPartyObj.has("cityCode")) {
								throwException("shipmentParty", "cityCode");
							}
							if (!shipmentPartyObj.has("stateCode")) {
								throwException("shipmentParty", "stateCode");
							}
							if (!shipmentPartyObj.has("countryCode")) {
								throwException("shipmentParty", "countryCode");
							}
							if (!shipmentPartyObj.has("postalCode")) {
								throwException("shipmentParty", "postalCode");
							}
							if (!shipmentPartyObj.has("pickUpZoneCode")) {
								throwException("shipmentParty", "pickUpZoneCode");
							}
						}
					}
				}
			}

			if (!jsonObj.has("shipmentPayment")) {
				throwException("", "shipmentPayment");
			}

			if (!jsonObj.isNull("shipmentPayment")) {
				JSONArray shipmentPaymentArr = jsonObj.getJSONArray("shipmentPayment");

				if (shipmentPaymentArr != null && shipmentPaymentArr.length() > 0) {
					for (int k = 0; k < shipmentPaymentArr.length(); k++) {
						JSONObject shipmentPaymentObj = shipmentPaymentArr.getJSONObject(k);
						if (shipmentPaymentObj != null) {
							if (!shipmentPaymentObj.has("localCurrencyCode")) {
								throwException("shipmentPayment", "localCurrencyCode");
							}
							if (!shipmentPaymentObj.has("payTypeCode")) {
								throwException("shipmentPayment", "payTypeCode");
							}
							if (!shipmentPaymentObj.has("collectedLocalCurrencyAmount")) {
								throwException("shipmentPayment", "collectedLocalCurrencyAmount");
							}
							if (!shipmentPaymentObj.has("locationTypeCode")) {
								throwException("shipmentPayment", "locationTypeCode");
							}
						}
					}
				}
			}

			if (!jsonObj.has("shipmentQWD")) {
				throwException("", "shipmentQWD");
			}

			if (!jsonObj.isNull("shipmentQWD")) {
				JSONArray shipmentQWDArr = jsonObj.getJSONArray("shipmentQWD");

				if (shipmentQWDArr != null && shipmentQWDArr.length() > 0) {
					for (int k = 0; k < shipmentQWDArr.length(); k++) {
						JSONObject shipmentQWDObj = shipmentQWDArr.getJSONObject(k);
						if (shipmentQWDObj != null) {
							if (!shipmentQWDObj.has("totalShipmentQty")) {
								throwException("shipmentQWD", "totalShipmentQty");
							}
							if (!shipmentQWDObj.has("chargeableWeightQty")) {
								throwException("shipmentQWD", "chargeableWeightQty");
							}
							if (!shipmentQWDObj.has("weightQty")) {
								throwException("shipmentQWD", "weightQty");
							}
							if (!shipmentQWDObj.has("ratePerChargeAmount")) {
								throwException("shipmentQWD", "ratePerChargeAmount");
							}
							if (!shipmentQWDObj.has("itemNumber")) {
								throwException("shipmentQWD", "itemNumber");
							}
							if (!shipmentQWDObj.has("containerTypeCode")) {
								throwException("shipmentQWD", "containerTypeCode");
							}
							if (!shipmentQWDObj.has("rateClassCode")) {
								throwException("shipmentQWD", "rateClassCode");
							}
							if (!shipmentQWDObj.has("rateCombinationPointCode")) {
								throwException("shipmentQWD", "rateCombinationPointCode");
							}
							if (!shipmentQWDObj.has("qwdDescription")) {
								throwException("shipmentQWD", "qwdDescription");
							}
							if (!shipmentQWDObj.has("unitOfWeight")) {
								throwException("shipmentQWD", "unitOfWeight");
							}
						}
					}
				}
			}

			if (!jsonObj.has("awbCharges")) {
				throwException("", "awbCharges");
			}

			if (!jsonObj.isNull("awbCharges")) {
				JSONObject awbChargesObj = jsonObj.getJSONObject("awbCharges");

				if (!awbChargesObj.has("mainCharges")) {
					throwException("awbCharges", "mainCharges");
				}

				if (!awbChargesObj.isNull("mainCharges")) {
					JSONArray mainChargesArr = awbChargesObj.getJSONArray("mainCharges");

					if (mainChargesArr != null && mainChargesArr.length() > 0) {
						for (int k = 0; k < mainChargesArr.length(); k++) {
							JSONObject mainChargesObj = mainChargesArr.getJSONObject(k);
							if (mainChargesObj != null) {
								if (!mainChargesObj.has("chargeCd")) {
									throwException("mainCharges", "chargeCd");
								}
								if (!mainChargesObj.has("chargeDesc")) {
									throwException("mainCharges", "chargeDesc");
								}
								if (!mainChargesObj.has("prePaidAmount")) {
									throwException("mainCharges", "prePaidAmount");
								}
								if (!mainChargesObj.has("collectAmount")) {
									throwException("mainCharges", "collectAmount");
								}
								if (!mainChargesObj.has("otherCharges")) {
									throwException("mainCharges", "otherCharges");
								}
							}
						}
					}
				}
			}

			if (!jsonObj.has("specialHandlingCodeList")) {
				throwException("", "specialHandlingCodeList");
			}

			if (!jsonObj.has("dangerousGoodList")) {
				throwException("", "dangerousGoodList");
			}

			if (!jsonObj.has("serviceCodeList")) {
				throwException("", "serviceCodeList");
			}

			if (!jsonObj.has("shipmentReference")) {
				throwException("", "shipmentReference");
			}

			if (!jsonObj.isNull("shipmentReference")) {
				JSONArray shipmentReferenceArr = jsonObj.getJSONArray("shipmentReference");

				if (shipmentReferenceArr != null && shipmentReferenceArr.length() > 0) {
					for (int k = 0; k < shipmentReferenceArr.length(); k++) {
						JSONObject shipmentReferenceObj = shipmentReferenceArr.getJSONObject(k);
						if (shipmentReferenceObj != null) {
							if (!shipmentReferenceObj.has("shipmentReferenceNumber")) {
								throwException("shipmentReference", "shipmentReferenceNumber");
							}
							if (!shipmentReferenceObj.has("referenceSerialNumber")) {
								throwException("shipmentReference", "referenceSerialNumber");
							}
							if (!shipmentReferenceObj.has("shipmentReferenceValueCode")) {
								throwException("shipmentReference", "shipmentReferenceValueCode");
							}
						}
					}
				}
			}
		}
	}

	private void throwException(String parentAttrName, String attrName) throws JSONException {
		System.out.println("No Attribute Found. " + parentAttrName + " -> " + attrName);
		throw new JSONException("No Attribute Found. " + parentAttrName + " -> " + attrName);
	}
}