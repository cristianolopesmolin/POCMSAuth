# POCMSAuth

Ordem de execução das aplicações:
	1º Config Server
	2º Eureka Server
	3º Api Gateway Zuul
	4º Demais serviços
	
Configurar o parâmetro "spring.cloud.config.server.native.search-locations" do arquivo application.properties do Config Server para o path onde estiverem os arquivos application.properties, ms-worker.properties e ms-worker-test.properties