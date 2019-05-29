package httpRequest;

public class StripeConnectAuthResponseBO {
	private String access_token;
	private boolean livemode;
	private String refresh_token;
	private String token_type;
	private String stripe_publishable_key;
	private String stripe_user_id;
	private String scope;
	private String error;
	private String error_description;
	public String getAccess_token() {
		return access_token;
	}
	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}
	public boolean isLivemode() {
		return livemode;
	}
	public void setLivemode(boolean livemode) {
		this.livemode = livemode;
	}
	public String getRefresh_token() {
		return refresh_token;
	}
	public void setRefresh_token(String refresh_token) {
		this.refresh_token = refresh_token;
	}
	public String getToken_type() {
		return token_type;
	}
	public void setToken_type(String token_type) {
		this.token_type = token_type;
	}
	public String getStripe_publishable_key() {
		return stripe_publishable_key;
	}
	public void setStripe_publishable_key(String stripe_publishable_key) {
		this.stripe_publishable_key = stripe_publishable_key;
	}
	public String getStripe_user_id() {
		return stripe_user_id;
	}
	public void setStripe_user_id(String stripe_user_id) {
		this.stripe_user_id = stripe_user_id;
	}
	public String getScope() {
		return scope;
	}
	public void setScope(String scope) {
		this.scope = scope;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public String getError_description() {
		return error_description;
	}
	public void setError_description(String error_description) {
		this.error_description = error_description;
	}
	@Override
	public String toString() {
		return "StripeResponseBO [access_token=" + access_token + ", livemode=" + livemode + ", refresh_token="
				+ refresh_token + ", token_type=" + token_type + ", stripe_publishable_key=" + stripe_publishable_key
				+ ", stripe_user_id=" + stripe_user_id + ", scope=" + scope + ", error=" + error
				+ ", error_description=" + error_description + "]";
	}
	
}
