#!/usr/bin/bash -v

java -cp . -Djavax.net.ssl.trustStore=Client_Truststore.jks \
	   -Djavax.net.ssl.trustStorePassword=435207 \
           -Djavax.net.ssl.keyStore=Server_Keystore.jks \
	   -Djavax.net.ssl.keyStorePassword=435307 \
	   -Dfile.encoding=UTF-8 cliente.Cliente \
