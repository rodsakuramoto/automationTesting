#!/bin/SHELL_ATUAL

echo "EXECUTANDO..."

cd target/relatorios/htmls
zip -r htmls *
mv htmls.zip ../
cd ../../../

modulos=("automationTesting")

  	 for ((cont=0; cont < 1; cont++)); 
	 do 
		

	 	echo "."
	 	echo "."
	 	echo "."
		echo "---------------------------------------- Indicando a pasta onde localiza-se o ${modulos[$cont]}-----------------------------------------------------"
        	sed -i "s/inicio/${modulos[$cont]}/" pom.xml
		

		echo "--------------------------------------------- Gerando o gráfico do ${modulos[$cont]}  --------------------------------------------------------------"
		mvn cluecumber-report:reporting
		


		echo "---------------------------------------------- Compactando o gráfico em formato zip  ---------------------------------------------- "
		sed -i "s/${modulos[$cont]}/inicio/" pom.xml
	done
		cd target/relatorios/graficos_gerados
		zip -r graficos.zip *
		mv graficos.zip ../
		cd ../../../
		




		echo "---------------------------------------- Se tudo ocorreu bem, procurar por  htmls.zip  e por graficos.zip em target ------------------------------------"
		
		
