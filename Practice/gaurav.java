package Practice;

import java.util.Arrays;

public class gaurav {
    public static void main(String[] args) {
        public class BusinessAccount {
            @ApiModelProperty(name = "businessAccountIOrderId", dataType = "String", notes = "InsertionOrderId", required = true, example = "New")
            private String businessAccountIOrderId;
            @ApiModelProperty(name = "accNumber", dataType = "String", notes = "Account Number",example = "123")
            private String accNumber;
            @ApiModelProperty(name = "iban", dataType = "String", notes = "IBAN", required = true, example = "ABC")
            private String iban;
            @ApiModelProperty(name = "accStatus", dataType = "String", notes = "Account Status", required = true, example = "Active")
            private String accStatus;
            @ApiModelProperty(name = "acctOpenDate", dataType = "String", notes = "Account Open Date", example = "2022-10-13 12:55:00")
            private String acctOpenDate;
            @ApiModelProperty(name = "accStatementMode", dataType = "String", notes = "Account Statement Mode", required = true, example = "EMAIL")
            private String accStatementMode;
            @ApiModelProperty(name = "chequeDeliveryMode", dataType = "String", notes = "Cheque Delivery Mode",example = "Authorised Representative")
            private String chequeDeliveryMode;
            @ApiModelProperty(name = "authRep", dataType = "String", notes = "Authorized Representative",example = "ABC")
            private String authRep;
            @ApiModelProperty(name = "eidAuthRep", dataType = "String", notes = "Emirate ID Of Authorized Representative", example = "ABC")
            private String eidAuthRep;
            @ApiModelProperty(name = "signReq", dataType = "String", notes = "Signature Requirements", required = true, example = "Joint")
            private String signReq;
        }

    }
}
