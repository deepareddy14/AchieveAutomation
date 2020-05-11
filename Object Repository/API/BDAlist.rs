<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>BDAlist</name>
   <tag></tag>
   <elementGuidId>16f04d42-cd38-4422-8434-a62bccf0e8fb</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <followRedirects>true</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;model\&quot;: \&quot;Employee\&quot;,\n    \&quot;contextCriterias\&quot;: [\n        {\n            \&quot;selectedColumn\&quot;: \&quot;role\&quot;,\n            \&quot;selectedOperator\&quot;: \&quot;in\&quot;,\n            \&quot;selectedValue\&quot;: [\n                \&quot;bda\&quot;\n            ]\n        },\n        {\n            \&quot;selectedColumn\&quot;: \&quot;status\&quot;,\n            \&quot;selectedOperator\&quot;: \&quot;not_in\&quot;,\n            \&quot;selectedValue\&quot;: [\n                \&quot;Left\&quot;,\n                \&quot;left\&quot;\n            ]\n        },\n        {\n            \&quot;selectedColumn\&quot;: \&quot;reportingTo.team_manager.userEmail\&quot;,\n            \&quot;selectedOperator\&quot;: \&quot;equal\&quot;,\n            \&quot;selectedValue\&quot;: [\n                \&quot;sagar.khatter@byjus.com\&quot;\n            ]\n        }\n    ],\n    \&quot;limit\&quot;: 1000,\n    \&quot;page\&quot;: 1,\n    \&quot;quickCriterias\&quot;: [],\n    \&quot;searchCriterias\&quot;: [],\n    \&quot;sort\&quot;: {}\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>x-impersonated-email</name>
      <type>Main</type>
      <value>sagar.khatter@byjus.com</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>x-refresh-token</name>
      <type>Main</type>
      <value>eyJjdHkiOiJKV1QiLCJlbmMiOiJBMjU2R0NNIiwiYWxnIjoiUlNBLU9BRVAifQ.jvoRw-DXuS8HHwlpZShWpaVvLARCQGOoO55btnUR-H_99Jb37wrFxRF5zZB6FFzW6qr2t9efFEJ7nQgtJtq6l-g7NySuCa2RGZEBLGcM4z9CAX9TAANus3pw1cS8bA3034lto0ph0sGk277zq01bMnmkOM7dREmGW4-NKlX8IdpTH9wZLPufx-JyH7xGAZXuW1h4-mGljXbW2huwnHJSujfG13lZnmteOfeDUuMBIe8sMeClQlEgiBJkReIHXFcOIEWEQu1uQcl7QbfLY6VIB9UxKfl-KdzJumMVLNFE4Hpx1Q4SY7-8oI5cpLJS5KTwcwo1KRMJG4w_cRRDC5lfgw.cvcDlDamgRaPRZ66.vsp48-z2avEH6ChZkATiO6UM3akD-e0ZjvPEXHE1UXv8K2ndYDWzyK8W2Qch8B9ISJTFN8RAYR9wVdHOcayaV6LFl_pxWskOBb2NHmx9IK3_s3g3Ub0molD5Dw9nNtf6iurQzZjqZG5uLy_xloZGX7HMD-6tz3nGJuEzOL8vrzPxefv_hMvwRGUVLVd3BEtPK-r0LL_rGcpaQzIv5FNuc2unLrqGWBZDZiumWCzGcjhyFaA_oNNK6rHlnkt0-wY0sZIkqK_rrOE-1N7pV1GMzNDCdFKgc9MoIhCTt4jwN_8jEbBLAoAnukLzf0zh6OrQfc0TSS8qLgMvlVtVsTG0Yn9sHPl9hsgI809iNFuP52u5mMggxz2nbq-cjDMnKsRhomIJxP7Egpzvf-Xtp_GT-R2urFJPfMMdR2LCo0v9wgYLBCllbAw4N4kZfs2USAk8aeSoaVaGY_A84Z7twSgFQ0I1HYNxc0qFY4zpko_qGQXid6m7Nt19pnt68vnF0vW4wgeK8B-H9x_7PH9ci5C9LpGXPwyeOzhD_uIv9G_ILHipu12gId_jUQyBpSt2i_sHfYog0BKCMchKvxvZ-amziEmHGFlf5U3gdvcuMnd_pjN9cCwkelbycVAARJsRG3ueSWwei3M6RY52fngIdbBYjaelVWVOrOlnoYpr0px1AqENcuX6sdz2x9AzFz-wkjTjsNTX_Ck3oUKFmkFKTkVQRd8pyPdgyEKx2GFmrVprVkftjy_U25-57EX369LsIt5q2N_R-GE9p3go4UexTgnn8erdEPMqO-vbwSnakZqXtFHpkyH1OTD9mu9TdGta55Indi3zb69fQ0ytx4hmaU6HaH1McmB-Q4g9d9Kn2-Ljmm0RMnJwS3JH2l2vwNYd24Y9Co63o66pR1_H_7hzGVMpddxo5IYu3CROewFoCM5DrsSQx6vv1gRDUleGpr_s5jTXHkUH9Nlk-zzS_FUqyVJaq83q4jYry-l9Zigg64xrKIbs7UHGGeV1Q4w9-ToXybAYTDwMijhUFU0bsqLBKBt0zHM_CxxCgPZl7EW4qeBN87dZdvW4F6okvNnZbx8IIMSxYLTk1Wu44nyjyK9JUKEgjCIwYDy386VrJ7DhfLs6I3JyiX2iyPwcGNkvRI6J6vFsfmMPwq-rmDRVbS6X0y8igDUrFnvtrEvz6F6IAjv1ZJiJQBvqC4UM-eY6Bix0f5qrUnZYbQp6Ucge4yJbKLtk8DcMbX8Etb8N3py6lpV2JnPfQGLA-WQXYn5MaeRriI-7IdpTZTLeZdDkQPHAbZrScY2XixTB.cBbgsLGzTHL4cmrU0iWtFg</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>content-type</name>
      <type>Main</type>
      <value>application/json;charset=UTF-8</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>x-id-token</name>
      <type>Main</type>
      <value>eyJraWQiOiJJV2Y3c0tGVVoxQTdwUEc2VlwvVktlUDJPOG53Q0lPbTFudTZBaDc1UG55RT0iLCJhbGciOiJSUzI1NiJ9.eyJhdF9oYXNoIjoieE5yX1psWE95LXJtaGN0Tmd4NDc2dyIsInN1YiI6IjMxYjI2OGYxLWVjYTgtNGEwMi1hZTg2LWNkNDZhNTNhYmE4ZCIsImNvZ25pdG86Z3JvdXBzIjpbImFwLXNvdXRoLTFfY0IzU2ZRWWliX0dvb2dsZSJdLCJlbWFpbF92ZXJpZmllZCI6dHJ1ZSwiaXNzIjoiaHR0cHM6XC9cL2NvZ25pdG8taWRwLmFwLXNvdXRoLTEuYW1hem9uYXdzLmNvbVwvYXAtc291dGgtMV9jQjNTZlFZaWIiLCJjb2duaXRvOnVzZXJuYW1lIjoiR29vZ2xlXzExMTA5Mjc4ODIyNDA4MDYzODk2NCIsImdpdmVuX25hbWUiOiJEZWVwYSIsIm5vbmNlIjoiS1lQSkJSdVFhdHRYOFVmUmhjSVY1Z3Z4czg3em1Zb0MxN3oybFIyVnlTYzhZclF3cERodGJoc2U3QllGV0FBUFdET3FBNDFTN3l0eThrNWpWWms1RFM0TzdjZmp4VmZlWWZyZWRqcmRXckNZTjdTd2lKeDhBUFNONy02czRmOVp0ZDdxN1M1WTYwUjZPVVZVblFiZFJOUlNEYU1USlJTV0NBemVJeWJjems0IiwicGljdHVyZSI6Imh0dHBzOlwvXC9saDMuZ29vZ2xldXNlcmNvbnRlbnQuY29tXC9hLVwvQU9oMTRHalNmVnZ0eEt2UmRqT3d2TlQ3dVdBS2Q3OW4tVUVqRG4ybmFKc3l6UT1zOTYtYyIsImF1ZCI6IjRnOGNrZmM4bGx0OHE3MHZtYmtnMGg3dTM4IiwiaWRlbnRpdGllcyI6W3sidXNlcklkIjoiMTExMDkyNzg4MjI0MDgwNjM4OTY0IiwicHJvdmlkZXJOYW1lIjoiR29vZ2xlIiwicHJvdmlkZXJUeXBlIjoiR29vZ2xlIiwiaXNzdWVyIjpudWxsLCJwcmltYXJ5IjoidHJ1ZSIsImRhdGVDcmVhdGVkIjoiMTU3ODQ2ODIyNDcyNyJ9XSwidG9rZW5fdXNlIjoiaWQiLCJhdXRoX3RpbWUiOjE1ODkwOTk3MTQsIm5hbWUiOiJEZWVwYSBSIiwiZXhwIjoxNTg5MTAzMzE0LCJpYXQiOjE1ODkwOTk3MTQsImZhbWlseV9uYW1lIjoiUiIsImVtYWlsIjoiZGVlcGEucmVkZHlAYnlqdXMuY29tIn0.HQwBdnpwfGvbXZeh2PUU4yafF1_AGAsgtygOBzWhdpX24teX5MMlfYUEEyfVDQwHdz0VGpZxGVSZhKYwMIadl1hiKExvMI9wK3UpCZP5UtELOz28QSZ_nem6COysXjucsXbxHio5pyUGJBdGncTu9hmC6wMN4rMJQeS0hndXO-wSSnHUnrUAr-QLc_4Ys6C6TTMe29jP7HLNXxJGaQVTouYAQXnI2nK7aIkj1t4YygzKl7Xj3TP7qtyiB_tk8rBIBHmVi3_6obI5A_UNcx6FVRtWuFJlAWhj06jFPPV3e2VSaJJ8bpObljGqBXOab6F9FGYYnJul7nSal3lgptxwCQ</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>x-access-token</name>
      <type>Main</type>
      <value>eyJraWQiOiJRQVhFTXhEK2Q2WVZYV1JLQ1wvblpqYjVlS1l6ZUlRNnpHN2ZTWFptbGdsRT0iLCJhbGciOiJSUzI1NiJ9.eyJzdWIiOiIzMWIyNjhmMS1lY2E4LTRhMDItYWU4Ni1jZDQ2YTUzYWJhOGQiLCJjb2duaXRvOmdyb3VwcyI6WyJhcC1zb3V0aC0xX2NCM1NmUVlpYl9Hb29nbGUiXSwidG9rZW5fdXNlIjoiYWNjZXNzIiwic2NvcGUiOiJhd3MuY29nbml0by5zaWduaW4udXNlci5hZG1pbiBwaG9uZSBvcGVuaWQgcHJvZmlsZSBlbWFpbCIsImF1dGhfdGltZSI6MTU4OTA5OTcxNCwiaXNzIjoiaHR0cHM6XC9cL2NvZ25pdG8taWRwLmFwLXNvdXRoLTEuYW1hem9uYXdzLmNvbVwvYXAtc291dGgtMV9jQjNTZlFZaWIiLCJleHAiOjE1ODkxMDMzMTQsImlhdCI6MTU4OTA5OTcxNCwidmVyc2lvbiI6MiwianRpIjoiN2FiZDZmMWQtYjQ5OS00ZmFiLTk2NzgtZTI0MTU4MzBhZGMwIiwiY2xpZW50X2lkIjoiNGc4Y2tmYzhsbHQ4cTcwdm1ia2cwaDd1MzgiLCJ1c2VybmFtZSI6Ikdvb2dsZV8xMTEwOTI3ODgyMjQwODA2Mzg5NjQifQ.F2_p6FIslC8y0nXBZYGLwJmh9myLYIWaMZu3FgAL6k1-BSeQpeoqhXHZxYbjcYrHmV2Jq69wHdVnLIZFQCL1jUt6Yp87ZOFcrZEPQxJm5wU7ktVvIdWMUaw_6W7DrxoYYx4jKUWt9BjE57uZv0wOhjr1HQieeIJQTmcjCK7BAvgsJ5KInMntI4MEdmBy0mSzeDsJnB2Is2KNg8vgj4vTlTIwVVL64J6y4xMR4QYKhgdNbZhccQKfY4zbLAPvNuCpP4-eGf-AIV1lFjN9RzJhvrW5JznHoRtwS-lm2VNtzNgHmYOXgnAQoyf6WX66AiqQoMNBI-TqU32HOiXdBKO7wQ</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>impersonated</name>
      <type>Main</type>
      <value>true</value>
   </httpHeaderProperties>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://nucleus.byjusorders.com/nucleusapi/usermanagement/employee/list</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>ca2b6ea6-75a7-47a0-acea-cb66e4968bb7</id>
      <masked>false</masked>
      <name>variable</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>22cb83be-47c2-47db-8973-54287fabb641</id>
      <masked>false</masked>
      <name>variable_0</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>cd257a11-b4ae-4acf-8f2a-417cfe8ee340</id>
      <masked>false</masked>
      <name>variable_1</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>64db502d-3a68-47ec-b6ed-6fcb56a5b3d6</id>
      <masked>false</masked>
      <name>variable_2</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>05a93b13-7002-4d5b-b326-cd27c6d8a539</id>
      <masked>false</masked>
      <name>variable_3</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>010ff064-72f9-4298-998e-673dadc533fb</id>
      <masked>false</masked>
      <name>variable_4</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>0c273d3d-c485-46af-84be-8a8d46c6f683</id>
      <masked>false</masked>
      <name>variable_5</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>ad18a6bc-d30b-455e-bcd2-e501ba0afad4</id>
      <masked>false</masked>
      <name>variable_6</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>5df169d4-788e-4bc7-821f-7ebe572fab60</id>
      <masked>false</masked>
      <name>variable_7</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>5828576d-4c6c-42db-ae8b-cbe7d6651d49</id>
      <masked>false</masked>
      <name>variable_8</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()

WS.verifyResponseStatusCode(response, 200)

assertThat(response.getStatusCode()).isEqualTo(200)



</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
