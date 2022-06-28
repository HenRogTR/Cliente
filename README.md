# Cliente
API que permite administrar datos de un cliente
## Versión requerida

	1. Permite obtener datos de cliente en base al código único del cliente
	2. Permite actualizar datos de cliente en base al código único del cliente
		2.1. El código unico cliente enviado debe existir
		2.2. El nuevo tipo y número de documento no debe existir previamente en BD, excepto el propio dato
		2.3. Es posible actualizar nombres, apellidos, tipo y número documento
	3. Se inicializa los datos con archivo data.sql en H2



## Instalación
	1. Ejecutar el comando docker para generar la imagen
```
docker image build -t cliente2 -f DockerFileReq2 .
```
Donde: cliente2 es nombre de la imagen con versión por defecto, DockerFileReq2 nombre del archivo de construcción de imagen. Los archivos a necesarios son; Cliente-2.0.0.jar, DockerFileReq2 ubicados en raiz de repositorio

	
	2. Ejecutar el comando docker para montar la imagen en un container.
	
```
docker container run --rm -it -e "SPRING_PROFILES_ACTIVE=dev" -p 8900:8900 henrogtr/cliente2
```
Donde: henrogtr es el usuario (docker hub) desde donde se descargará la imagen

## Pruebas

	1. Importar los archivos postman ubicados en rama develop-f2 (raiz sistema)


## Datos

|ID|CODIGO_UNICO|NOMBRES|APELLIDOS|TIPO_DOCUMENTO|NUMERO_DOCUMENTO|FECHA_REGISTRO|
|----|----|----|----|----|----|----|
|1|00001111|ADRIANA CAROLINA|HERNANDEZ MONTERROZA|DNI|40000001|Fecha de registro|
|2|00001112|ADRIANA MARCELA|REY SANCHEZ|CE|40000002|Fecha de registro|
|3|00001113|ADRIANA MARCELA|REY SANCHEZ|PTP|40000003|Fecha de registro|
|4|00001114|ALEJANDRO|ABONDANO ACEVEDO|PTP|40000004|Fecha de registro|
|5|00001115|ALEXANDER|CARVAJAL VARGAS|CE|40000005|Fecha de registro|
|6|00001116|ANDREA CATALINA|ACERO CARO|CE|40000006|Fecha de registro|
|7|00001117|ANDREA LILIANA|CRUZ GARCIA|CE|40000007|Fecha de registro|
|8|00001118|ANDRES FELIPE|VILLA MONROY|CE|40000008|Fecha de registro|
|9|00001119|ANGELA PATRICIA|MAHECHA PIÑEROS|CE|40000009|Fecha de registro|
|10|00001120|ANGELICA LISSETH|BLANCO CONCHA|PTP|40000010|Fecha de registro|
|11|00001121|ANGELICA MARIA|ROCHA GARCIA|DNI|40000011|Fecha de registro|
|12|00001122|ANGIE TATIANA|FERNÁNDEZ MARTÍNEZ|CE|40000012|Fecha de registro|
|13|00001123|BRIGITE|POLANCO RUIZ|CE|40000013|Fecha de registro|
|14|00001124|CAMILO|VILLAMIZAR ARISTIZABAL|PTP|40000014|Fecha de registro|
|15|00001125|CAMILO|RODRÍGUEZ BOTERO|CE|40000015|Fecha de registro|
|16|00001126|CAMILO ALBERTO|CORTÉS MONTEJO|CE|40000016|Fecha de registro|
|17|00001127|CAMILO ENRIQUE|GOMEZ RODRIGUEZ|PTP|40000017|Fecha de registro|
|18|00001128|CARLOS ANDRÉS|POLO CASTELLANOS|CE|40000018|Fecha de registro|
|19|00001129|CARLOS DIDIER|CASTAÑO CONTRERAS|DNI|40000019|Fecha de registro|
|20|00001130|CARLOS FELIPE|MOGOLLÓN PACHÓN|DNI|40000020|Fecha de registro|
|21|00001131|CAROL RUCHINA|GOMEZ GIANINE|CE|40000021|Fecha de registro|
|22|00001132|CAROL RUCHINA|GOMEZ GIANINE|DNI|40000022|Fecha de registro|
|23|00001133|CAROLINA|PINTOR PINZON|CE|40000023|Fecha de registro|
|24|00001134|CATHERINE|OSPINA ALFONSO|PTP|40000024|Fecha de registro|
|25|00001135|CINTHYA FERNANDA|DUSSÁN GUZMÁN|CE|40000025|Fecha de registro|
|26|00001136|CLAUDIA LILIANA|TORRES FRIAS|CE|40000026|Fecha de registro|
|27|00001137|CRISTINA ELIZABETH|BARTHEL GUARDIOLA|CE|40000027|Fecha de registro|
|28|00001138|DANIEL|GÓMEZ DELGADO|CE|40000028|Fecha de registro|
|29|00001139|DANIEL ANDRÉS|CASTIBLANCO SALGADO|PTP|40000029|Fecha de registro|
|30|00001140|DANIELA|HERNÁNDEZ BRAVO|CE|40000030|Fecha de registro|
|31|00001141|DANIELA|HERNÁNDEZ BRAVO|DNI|40000031|Fecha de registro|
|32|00001142|DANIELA|GUZMÁN|PTP|40000032|Fecha de registro|
|33|00001143|DANIELA KATHERINNE|SUARIQUE ÁVILA|CE|40000033|Fecha de registro|
|34|00001144|DANIELLA|PUERTO NAVIA|PTP|40000034|Fecha de registro|
|35|00001145|DIEGO ALEJANDRO|FORERO PEÑA|CE|40000038|Fecha de registro|
|36|00001146|ESTEWIL CARLOS|QUESADA CALDERÍN|CE|40000039|Fecha de registro|
|37|00001147|ESTEWIL CARLOS|QUESADA CALDERÍN|DNI|40000040|Fecha de registro|
|38|00001148|FABIAN ANDRES|FINO ANDRADE|DNI|40000041|Fecha de registro|
|39|00001149|GABRIEL FELIPE|HERRERA MORENO|PTP|40000042|Fecha de registro|
|40|00001150|GABRIEL MAURICIO|NIETO BUSTOS|CE|40000043|Fecha de registro|
|41|00001151|GABRIEL MAURICIO|NIETO BUSTOS|CE|40000044|Fecha de registro|
|42|00001152|GLORIA PATRICIA|MENDOZA ALVEAR|CE|40000045|Fecha de registro|
|43|00001153|IVÁN DAVID|CORAL BURBANO|CE|40000048|Fecha de registro|
|44|00001154|IVONNE JOULIETTE|BARRERA LOPEZ|CE|40000049|Fecha de registro|
|45|00001155|JENNY FERNANDA|SÁNCHEZ ARENAS|PTP|40000050|Fecha de registro|
|46|00001156|JENNY VIVIANA|MONCALEANO PRECIADO|CE|40000051|Fecha de registro|
|47|00001157|JORGE ESTEBAN|REY BOTERO|CE|40000052|Fecha de registro|
|48|00001158|JORGE MARIO|OROZCO DUSSÁN|CE|40000053|Fecha de registro|
|49|00001159|JORGE MARIO|OROZCO DUSSÁN|PTP|40000054|Fecha de registro|
|50|00001160|JOSE GUILLERMO|MARIN ZUBIETA|PTP|40000055|Fecha de registro|
|51|00001161|JUAN CAMILO|ORTEGA PEÑA|PTP|40000056|Fecha de registro|
|52|00001162|JUAN CAMILO|JIMENEZ CORTES|CE|40000057|Fecha de registro|
|53|00001163|JUAN CAMILO|JIMENEZ CORTES|DNI|40000058|Fecha de registro|
|54|00001164|JUAN ESTEBAN|LANAO SÁNCHEZ|DNI|40000059|Fecha de registro|
|55|00001165|JUAN FERNANDO|BARJUCH MORENO|CE|40000060|Fecha de registro|
|56|00001166|JUAN SEBASTIAN|ROMERO ESCOBAR|CE|40000061|Fecha de registro|
|57|00001167|JUAN SEBASTIAN|TARQUINO ACOSTA|DNI|40000062|Fecha de registro|
|58|00001168|JUAN SEBASTIAN|SANCHEZ SANCHEZ|PTP|40000063|Fecha de registro|
|59|00001169|JULIÁN|ROMERO MONTOYA|CE|40000064|Fecha de registro|
|60|00001170|JULIAN LEONARDO|SANCHEZ PRADA|CE|40000065|Fecha de registro|
|61|00001171|JULIANA|GAVIRIA GARCIA|CE|40000066|Fecha de registro|
|62|00001172|KAREN ELIANA|HERNÁNDEZ PULIDO|PTP|40000068|Fecha de registro|
|63|00001173|LAURA|DIAZ MEJIA|CE|40000069|Fecha de registro|
|64|00001174|LAURA CAMILA|PUERTO CASTRO|CE|40000070|Fecha de registro|
|65|00001175|LAURA FERNANDA|RODRÍGUEZ TORRES|CE|40000072|Fecha de registro|
|66|00001176|LAURA FERNANDA|RODRÍGUEZ TORRES|PTP|40000073|Fecha de registro|
|67|00001177|LAURA NATALIA|NOVOA GOMEZ|CE|40000074|Fecha de registro|
|68|00001178|LAURA VIVIANA|DEL RÍO AYERBE|CE|40000075|Fecha de registro|
|69|00001179|LEONARDO ANDRÉS|DUEÑAS ROJAS|CE|40000076|Fecha de registro|
|70|00001180|LINA MARÍA|ZÚÑIGA RAMÍREZ|CE|40000077|Fecha de registro|
|71|00001181|LISETH TATIANA|SIERRA VILLAMIL|CE|40000078|Fecha de registro|
|72|00001182|LISETH TATIANA|SIERRA VILLAMIL|DNI|40000079|Fecha de registro|
|73|00001183|LUISA FERNANDA|GARCÍA FONNEGRA|PTP|40000080|Fecha de registro|
|74|00001184|LUISA FERNANDA|GARCÍA FONNEGRA|DNI|40000081|Fecha de registro|
|75|00001185|MARCELA|GARCIA RUEDA|PTP|40000082|Fecha de registro|
|76|00001186|MARIA ALEJANDRA|BOLÍVAR GALEANO|CE|40000083|Fecha de registro|
|77|00001187|MARIA ALEJANDRA|HORTA OCHOA|CE|40000084|Fecha de registro|
|78|00001188|MARÍA ANGÉLICA|BELTRÁN CASTILLO|CE|40000085|Fecha de registro|
|79|00001189|MARÍA CAMILA|GUACAS JIMÉNEZ|CE|40000086|Fecha de registro|
|80|00001190|MARIA CAMILA|NIETO BUSTOS|DNI|40000087|Fecha de registro|
|81|00001191|MARIA JOSÉ|GARCÍA MORA|PTP|40000088|Fecha de registro|
|82|00001192|MARIA JOSÉ|GARCÍA MORA|CE|40000089|Fecha de registro|
|83|00001193|MARIA MARGARITA|PEREZ MORENO|CE|40000090|Fecha de registro|
|84|00001194|MARIA MARGARITA|PEREZ MORENO|DNI|40000091|Fecha de registro|
|85|00001195|MARIA NATALIA|CERVANTES LUNA|CE|40000092|Fecha de registro|
|86|00001196|MARIANA DEL PILAR|SANTOS MILACHAY|DNI|40000093|Fecha de registro|
|87|00001197|MARIO FERNANDO|GARZÓN MUÑOZ|CE|40000094|Fecha de registro|
|88|00001198|MÓNICA ALEXANDRA|CAMACHO AMAYA|CE|40000095|Fecha de registro|
|89|00001199|MÓNICA NATALIA|CAMARGO MENDOZA|PTP|40000096|Fecha de registro|
|90|00001200|NATALIA|BUITRAGO CONTRERAS|CE|40000097|Fecha de registro|
|91|00001201|NATALIA|PUENTES PERDOMO|CE|40000098|Fecha de registro|
|92|00001202|NATALIA ANDREA|GUTIÉRREZ VELASCO|CE|40000099|Fecha de registro|
|93|00001203|NATALIA MELISSA|BARRERO FORERO|CE|40000100|Fecha de registro|
|94|00001204|NATALIA VIVY|CASAS PÁEZ|PTP|40000101|Fecha de registro|
|95|00001205|OLGA STEPHANNIA|SAMAN JIMENEZ|CE|40000102|Fecha de registro|
|96|00001206|OLGA VIVIANA|OVALLE SOLANO|CE|40000103|Fecha de registro|
|97|00001207|OSCAR FABIAN|CASTELLANOS ROJAS|CE|40000104|Fecha de registro|
|98|00001208|OSCAR DAVID|COLMENARES BARBUDO|CE|40000105|Fecha de registro|
|99|00001209|OSCAR JULIAN|ULLOA ORJUELA|DNI|40000106|Fecha de registro|
|100|00001210|PABLO|URIBE ANTIA|DNI|40000107|Fecha de registro|
|101|00001211|PAOLA ANDREA|CORREA LARIOS|PTP|40000108|Fecha de registro|
|102|00001212|RAFAEL ALEJANDRO|GONZALEZ ROJAS|CE|40000109|Fecha de registro|
|103|00001213|RAFAEL ANDRES|ALVAREZ CASTILLO|CE|40000110|Fecha de registro|
|104|00001214|RAFAEL ANDRES|ALVAREZ CASTILLO|DNI|40000111|Fecha de registro|
|105|00001215|RICARDO|VEGA ZAMBRANO|CE|40000112|Fecha de registro|
|106|00001216|RICARDO|VEGA ZAMBRANO|PTP|40000113|Fecha de registro|
|107|00001217|SANDRA XIMENA|GARCÉS PARRA|CE|40000114|Fecha de registro|
|108|00001218|SEBASTIAN|BORDA MELGUIZO|DNI|40000115|Fecha de registro|
|109|00001219|SEBASTIÁN|IREGUI GALEANO|PTP|40000116|Fecha de registro|
|110|00001220|YIRIAM LILIAM|OCHOA SABOGAL|PTP|40000117|Fecha de registro|
|111|00001221|YIRIAM LILIAM|OCHOA SABOGAL|DNI|40000118|Fecha de registro|
|112|00001222|YURANY CATALINA|CIFUENTES MENDEZ|DNI|40000119|Fecha de registro|
|113|00001223|YURI CATALINA|SALAZAR ARISTIZABAL|CE|40000120|Fecha de registro|


