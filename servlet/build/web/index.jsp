<%-- 
    Document   : index
    Created on : 27-02-2019, 19:09:26
    Author     : 56974
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>practica Servlets</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

    </head>
    <body>

        <div class="container p-5">

            <h1>Formulario para provar Servlet</h1>

            <div class="row">
                <div class="col-md-8">

                    <div class="card card-body bg-light ">
                        <form action="ServletsControlador" method="POST" >
                            <div class="form-group">
                                <input type="text" id="email" name="userName" class="form-control" placeholder="Ingresa tu nombres" autofocus >
                            </div>
                            <div class="form-group">
                                <input type="text" id="pass" name="userFone" class="form-control" placeholder="Ingresa tu celular" autofocus >
                            </div>
                            <div class="form-group">
                                <input type="text" id="pass" name="userCorreo" class="form-control" placeholder="Ingresa tu correo" autofocus >
                            </div>

                            <input type="submit" class="btn btn-info" name="btn" value="Enviar">
                        </form>
                    </div>
                </div>
            </div>


            <div class="row pt-5">
                <div class="col-md-8 ">
                    <div class="card card-body bg-light ">

                        <table class="table table-hover table-bordered">
                            <tr>
                                <th scope="col" class="text-center">ID</th>
                                <th scope="col" class="text-center">RUT</th>
                                <th scope="col" class="text-center">NOMBRES</th>
                                <th scope="col" class="text-center">ACTIVIDAD</th>
                                <th scope="col" class="text-center">ACCIONES</th>


                            </tr>

                            <tr>
                                <td data-label class="text-center"></td>
                                <td data-label class="text-center"></td>
                                <td data-label class="text-center"></td>
                                <td data-label class="text-center"></td>
                                <td class="text-center">
                                    <a href="Editar.jsp?" class="btn btn-warning btn-sm m-1">Editar</a> 
                                    <a href="Eliminar.jsp"class="btn btn-danger btn-sm m-1">Eliminar</a>
                                </td>

                            </tr>


                        </table>
                    </div>
                </div>
            </div>

        </div>




    </body>
</html>
