/*
 * Copyright 2012-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.boot.autoconfigure.security.oauth2.resource;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * OAuth 2.0 resource server properties.
 *
 * @author Madhura Bhave
 */
@ConfigurationProperties(prefix = "spring.security.oauth2.resource")
public class OAuth2ResourceServerProperties {

	private Jwt jwt = new Jwt();

	public Jwt getJwt() {
		return this.jwt;
	}

	public void setJwt(Jwt jwt) {
		this.jwt = jwt;
	}

	public static class Jwt {

		private Jwk jwk = new Jwk();

		public Jwk getJwk() {
			return this.jwk;
		}

		public void setJwk(Jwk jwk) {
			this.jwk = jwk;
		}

	}

	public static class Jwk {

		/**
		 * The URI to get verification keys to verify the JWT token.
		 */
		private String setUri;

		public String getSetUri() {
			return this.setUri;
		}

		public void setSetUri(String setUri) {
			this.setUri = setUri;
		}

	}

}
