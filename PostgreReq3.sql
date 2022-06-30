
CREATE TABLE public.documento (
                id int8 NOT NULL,
                tipo VARCHAR(255) NOT NULL,
                fecha_registro timestamp NOT NULL,
                CONSTRAINT documento_pk PRIMARY KEY (id)
);

INSERT INTO documento
			(id,
			tipo,
			fecha_registro
			)
VALUES 		('1','DNI', now()),
			('2','CE', now()),
			('3','PTP', now());
			
CREATE TABLE public.cliente (
                id int8 NOT NULL,
                codigo_unico VARCHAR(255) NOT NULL,
                nombres VARCHAR(255) NOT NULL,
                apellidos VARCHAR(255) NOT NULL,
				documento_id BIGINT NOT NULL,
				numero_documento VARCHAR(255) NOT NULL,
				fecha_registro timestamp NOT NULL,
                CONSTRAINT cliente_pk PRIMARY KEY (id),
                CONSTRAINT documento_id_fk FOREIGN KEY(documento_id) REFERENCES public.documento(id)
);

INSERT INTO public.cliente
            (id,
             codigo_unico,
             nombres,
             apellidos,
             documento_id,
             numero_documento,
             fecha_registro)
VALUES      
('1','00001111','ADRIANA CAROLINA','HERNANDEZ MONTERROZA','1','40000001',now()),
('2','00001112','ADRIANA MAR2LA','REY SANCHEZ','2','40000002',now()),
('3','00001113','ADRIANA MAR2LA','REY SANCHEZ','3','40000003',now()),
('4','00001114','ALEJANDRO','ABONDANO A2VEDO','3','40000004',now()),
('5','00001115','ALEXANDER','CARVAJAL VARGAS','2','40000005',now()),
('6','00001116','ANDREA CATALINA','A2RO CARO','2','40000006',now()),
('7','00001117','ANDREA LILIANA','CRUZ GARCIA','2','40000007',now()),
('8','00001118','ANDRES FELIPE','VILLA MONROY','2','40000008',now()),
('9','00001119','ANGELA PATRICIA','MAHECHA PIÑEROS','2','40000009',now()),
('10','00001120','ANGELICA LISSETH','BLANCO CONCHA','3','40000010',now()),
('11','00001121','ANGELICA MARIA','ROCHA GARCIA','1','40000011',now()),
('12','00001122','ANGIE TATIANA','FERNÁNDEZ MARTÍNEZ','2','40000012',now()),
('13','00001123','BRIGITE','POLANCO RUIZ','2','40000013',now()),
('14','00001124','CAMILO','VILLAMIZAR ARISTIZABAL','3','40000014',now()),
('15','00001125','CAMILO','RODRÍGUEZ BOTERO','2','40000015',now()),
('16','00001126','CAMILO ALBERTO','CORTÉS MONTEJO','2','40000016',now()),
('17','00001127','CAMILO ENRIQUE','GOMEZ RODRIGUEZ','3','40000017',now()),
('18','00001128','CARLOS ANDRÉS','POLO CASTELLANOS','2','40000018',now()),
('19','00001129','CARLOS DIDIER','CASTAÑO CONTRERAS','1','40000019',now()),
('20','00001130','CARLOS FELIPE','MOGOLLÓN PACHÓN','1','40000020',now()),
('21','00001131','CAROL RUCHINA','GOMEZ GIANINE','2','40000021',now()),
('22','00001132','CAROL RUCHINA','GOMEZ GIANINE','1','40000022',now()),
('23','00001133','CAROLINA','PINTOR PINZON','2','40000023',now()),
('24','00001134','CATHERINE','OSPINA ALFONSO','3','40000024',now()),
('25','00001135','CINTHYA FERNANDA','DUSSÁN GUZMÁN','2','40000025',now()),
('26','00001136','CLAUDIA LILIANA','TORRES FRIAS','2','40000026',now()),
('27','00001137','CRISTINA ELIZABETH','BARTHEL GUARDIOLA','2','40000027',now()),
('28','00001138','DANIEL','GÓMEZ DELGADO','2','40000028',now()),
('29','00001139','DANIEL ANDRÉS','CASTIBLANCO SALGADO','3','40000029',now()),
('30','00001140','DANIELA','HERNÁNDEZ BRAVO','2','40000030',now()),
('31','00001141','DANIELA','HERNÁNDEZ BRAVO','1','40000031',now()),
('32','00001142','DANIELA','GUZMÁN','3','40000032',now()),
('33','00001143','DANIELA KATHERINNE','SUARIQUE ÁVILA','2','40000033',now()),
('34','00001144','DANIELLA','PUERTO NAVIA','3','40000034',now()),
('35','00001145','DIEGO ALEJANDRO','FORERO PEÑA','2','40000038',now()),
('36','00001146','ESTEWIL CARLOS','QUESADA CALDERÍN','2','40000039',now()),
('37','00001147','ESTEWIL CARLOS','QUESADA CALDERÍN','1','40000040',now()),
('38','00001148','FABIAN ANDRES','FINO ANDRADE','1','40000041',now()),
('39','00001149','GABRIEL FELIPE','HERRERA MORENO','3','40000042',now()),
('40','00001150','GABRIEL MAURICIO','NIETO BUSTOS','2','40000043',now()),
('41','00001151','GABRIEL MAURICIO','NIETO BUSTOS','2','40000044',now()),
('42','00001152','GLORIA PATRICIA','MENDOZA ALVEAR','2','40000045',now()),
('43','00001153','IVÁN DAVID','CORAL BURBANO','2','40000048',now()),
('44','00001154','IVONNE JOULIETTE','BARRERA LOPEZ','2','40000049',now()),
('45','00001155','JENNY FERNANDA','SÁNCHEZ ARENAS','3','40000050',now()),
('46','00001156','JENNY VIVIANA','MONCALEANO PRECIADO','2','40000051',now()),
('47','00001157','JORGE ESTEBAN','REY BOTERO','2','40000052',now()),
('48','00001158','JORGE MARIO','OROZCO DUSSÁN','2','40000053',now()),
('49','00001159','JORGE MARIO','OROZCO DUSSÁN','3','40000054',now()),
('50','00001160','JOSE GUILLERMO','MARIN ZUBIETA','3','40000055',now()),
('51','00001161','JUAN CAMILO','ORTEGA PEÑA','3','40000056',now()),
('52','00001162','JUAN CAMILO','JIMENEZ CORTES','2','40000057',now()),
('53','00001163','JUAN CAMILO','JIMENEZ CORTES','1','40000058',now()),
('54','00001164','JUAN ESTEBAN','LANAO SÁNCHEZ','1','40000059',now()),
('55','00001165','JUAN FERNANDO','BARJUCH MORENO','2','40000060',now()),
('56','00001166','JUAN SEBASTIAN','ROMERO ESCOBAR','2','40000061',now()),
('57','00001167','JUAN SEBASTIAN','TARQUINO ACOSTA','1','40000062',now()),
('58','00001168','JUAN SEBASTIAN','SANCHEZ SANCHEZ','3','40000063',now()),
('59','00001169','JULIÁN','ROMERO MONTOYA','2','40000064',now()),
('60','00001170','JULIAN LEONARDO','SANCHEZ PRADA','2','40000065',now()),
('61','00001171','JULIANA','GAVIRIA GARCIA','2','40000066',now()),
('62','00001172','KAREN ELIANA','HERNÁNDEZ PULIDO','3','40000068',now()),
('63','00001173','LAURA','DIAZ MEJIA','2','40000069',now()),
('64','00001174','LAURA CAMILA','PUERTO CASTRO','2','40000070',now()),
('65','00001175','LAURA FERNANDA','RODRÍGUEZ TORRES','2','40000072',now()),
('66','00001176','LAURA FERNANDA','RODRÍGUEZ TORRES','3','40000073',now()),
('67','00001177','LAURA NATALIA','NOVOA GOMEZ','2','40000074',now()),
('68','00001178','LAURA VIVIANA','DEL RÍO AYERBE','2','40000075',now()),
('69','00001179','LEONARDO ANDRÉS','DUEÑAS ROJAS','2','40000076',now()),
('70','00001180','LINA MARÍA','ZÚÑIGA RAMÍREZ','2','40000077',now()),
('71','00001181','LISETH TATIANA','SIERRA VILLAMIL','2','40000078',now()),
('72','00001182','LISETH TATIANA','SIERRA VILLAMIL','1','40000079',now()),
('73','00001183','LUISA FERNANDA','GARCÍA FONNEGRA','3','40000080',now()),
('74','00001184','LUISA FERNANDA','GARCÍA FONNEGRA','1','40000081',now()),
('75','00001185','MAR2LA','GARCIA RUEDA','3','40000082',now()),
('76','00001186','MARIA ALEJANDRA','BOLÍVAR GALEANO','2','40000083',now()),
('77','00001187','MARIA ALEJANDRA','HORTA OCHOA','2','40000084',now()),
('78','00001188','MARÍA ANGÉLICA','BELTRÁN CASTILLO','2','40000085',now()),
('79','00001189','MARÍA CAMILA','GUACAS JIMÉNEZ','2','40000086',now()),
('80','00001190','MARIA CAMILA','NIETO BUSTOS','1','40000087',now()),
('81','00001191','MARIA JOSÉ','GARCÍA MORA','3','40000088',now()),
('82','00001192','MARIA JOSÉ','GARCÍA MORA','2','40000089',now()),
('83','00001193','MARIA MARGARITA','PEREZ MORENO','2','40000090',now()),
('84','00001194','MARIA MARGARITA','PEREZ MORENO','1','40000091',now()),
('85','00001195','MARIA NATALIA','2RVANTES LUNA','2','40000092',now()),
('86','00001196','MARIANA DEL PILAR','SANTOS MILACHAY','1','40000093',now()),
('87','00001197','MARIO FERNANDO','GARZÓN MUÑOZ','2','40000094',now()),
('88','00001198','MÓNICA ALEXANDRA','CAMACHO AMAYA','2','40000095',now()),
('89','00001199','MÓNICA NATALIA','CAMARGO MENDOZA','3','40000096',now()),
('90','00001200','NATALIA','BUITRAGO CONTRERAS','2','40000097',now()),
('91','00001201','NATALIA','PUENTES PERDOMO','2','40000098',now()),
('92','00001202','NATALIA ANDREA','GUTIÉRREZ VELASCO','2','40000099',now()),
('93','00001203','NATALIA MELISSA','BARRERO FORERO','2','40000100',now()),
('94','00001204','NATALIA VIVY','CASAS PÁEZ','3','40000101',now()),
('95','00001205','OLGA STEPHANNIA','SAMAN JIMENEZ','2','40000102',now()),
('96','00001206','OLGA VIVIANA','OVALLE SOLANO','2','40000103',now()),
('97','00001207','OSCAR FABIAN','CASTELLANOS ROJAS','2','40000104',now()),
('98','00001208','OSCAR DAVID','COLMENARES BARBUDO','2','40000105',now()),
('99','00001209','OSCAR JULIAN','ULLOA ORJUELA','1','40000106',now()),
('100','00001210','PABLO','URIBE ANTIA','1','40000107',now()),
('101','00001211','PAOLA ANDREA','CORREA LARIOS','3','40000108',now()),
('102','00001212','RAFAEL ALEJANDRO','GONZALEZ ROJAS','2','40000109',now()),
('103','00001213','RAFAEL ANDRES','ALVAREZ CASTILLO','2','40000110',now()),
('104','00001214','RAFAEL ANDRES','ALVAREZ CASTILLO','1','40000111',now()),
('105','00001215','RICARDO','VEGA ZAMBRANO','2','40000112',now()),
('106','00001216','RICARDO','VEGA ZAMBRANO','3','40000113',now()),
('107','00001217','SANDRA XIMENA','GARCÉS PARRA','2','40000114',now()),
('108','00001218','SEBASTIAN','BORDA MELGUIZO','1','40000115',now()),
('109','00001219','SEBASTIÁN','IREGUI GALEANO','3','40000116',now()),
('110','00001220','YIRIAM LILIAM','OCHOA SABOGAL','3','40000117',now()),
('111','00001221','YIRIAM LILIAM','OCHOA SABOGAL','1','40000118',now()),
('112','00001222','YURANY CATALINA','CIFUENTES MENDEZ','1','40000119',now()),
('113','00001223','YURI CATALINA','SALAZAR ARISTIZABAL','2','40000120',now());