#language:es
#Author: your.email@your.domain.com

@tag
Característica: Registrar un empleado
  		Como usuario
  		Quiero registrar un empleado en OrageHG
  		A Navegar en la pagina

  @tag1
  Escenario: Registar un empleado exitoso
    Dado que david necesita crear un empleado en el OrageHR
    Cuando el realiza el ingreso del registro en la aplicacion 
    | usuario | contraseña | nombre | segundoNombre  | apellido | id   | ubicacion     | otroId | fechaNacimiento | estadoCivil | nacionalidad | licencia  | fechaVencimiento | apodo | servicioMilitar |
		| admin		| 12345			 | Pdaolo	  | Carlos	      | Pedraza	 | 04394 | London Office | 45167	 | 1997-04-03	 	   | Married  	 | Italian	    | 123456789 | 2030-12-12		   | Gato  | 987654321		   | 	
    Entonces el visualiza el id 04394 en el aplicativo
    