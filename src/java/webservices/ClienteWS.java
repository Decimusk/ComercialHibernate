/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webservices;

import dao.ClienteDao;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import model.Clientes;

/**
 *
 * @author Ing. Guillermo Pérez
 */
@WebService(serviceName = "ClienteWS")
public class ClienteWS {


    /**
     * Web service operation
     * @param Cli_Id
     * @param Cli_Apellidos
     * @param Cli_Nombres
     * @param Cli_NombreCompleto
     * @param Cli_Direccion
     * @param Cli_Ciudad
     * @param Cli_Telefono
     * @return 
     */
    @WebMethod(operationName = "IngresarCliente")
    public String IngresarCliente(@WebParam(name = "Cli_Id") String Cli_Id, @WebParam(name = "Cli_Apellidos") String Cli_Apellidos, @WebParam(name = "Cli_Nombres") String Cli_Nombres, @WebParam(name = "Cli_NombreCompleto") String Cli_NombreCompleto, @WebParam(name = "Cli_Direccion") String Cli_Direccion, @WebParam(name = "Cli_Ciudad") String Cli_Ciudad, @WebParam(name = "Cli_Telefono") String Cli_Telefono) {
        //TODO write your implementation code here:
        Clientes c = new Clientes(Cli_Id, Cli_Apellidos, Cli_Nombres, Cli_NombreCompleto, Cli_Direccion, Cli_Ciudad, Cli_Telefono);
        ClienteDao clienteDao = new ClienteDao();
        clienteDao.ingresarClientes(c);
        return "Se registró un Cliente";
    }
}
