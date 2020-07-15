package com.wpl.model;

import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class PaytmDetails {
		@Id
		private String merchantId;

	    private String merchantKey;

	    private String channelId;

	    private String website;

	    private String industryTypeId;

	    private String paytmUrl;

	    private Map<String, String> details;

		public String getMerchantId() {
			return merchantId;
		}

		public void setMerchantId(String merchantId) {
			this.merchantId = merchantId;
		}

		public String getMerchantKey() {
			return merchantKey;
		}

		public void setMerchantKey(String merchantKey) {
			this.merchantKey = merchantKey;
		}

		public String getChannelId() {
			return channelId;
		}

		public void setChannelId(String channelId) {
			this.channelId = channelId;
		}

		public String getWebsite() {
			return website;
		}

		public void setWebsite(String website) {
			this.website = website;
		}

		public String getIndustryTypeId() {
			return industryTypeId;
		}

		public void setIndustryTypeId(String industryTypeId) {
			this.industryTypeId = industryTypeId;
		}

		public String getPaytmUrl() {
			return paytmUrl;
		}

		public void setPaytmUrl(String paytmUrl) {
			this.paytmUrl = paytmUrl;
		}

		public Map<String, String> getDetails() {
			return details;
		}

		public void setDetails(Map<String, String> details) {
			this.details = details;
		}

	}


