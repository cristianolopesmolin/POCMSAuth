# POCMSAuth

Ordem de execu��o das aplica��es:
	1� Config Server
	2� Eureka Server
	3� Api Gateway Zuul
	4� Demais servi�os
	
Configurar o par�metro "spring.cloud.config.server.native.search-locations" do arquivo application.properties do Config Server para o path onde estiverem os arquivos application.properties, ms-worker.properties e ms-worker-test.properties