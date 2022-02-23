package mainApp.service;

import java.util.List;

import mainApp.dto.Empleado;

public interface IEmpleadoService {

	// METODOS DEL CRUD
	public List<Empleado> listaEmpleados(); // LISTAR TODOS LOS EMPLEADOS

	public Empleado addEmpleado(Empleado empleado); // ADD NUEVO EMPLEADO

	public Empleado getEmpleadoById(Long id); // GET EMPLEADO BY ID

	public List<Empleado> listarEmpleadoNombre(String nombre); // LISTA EMPLEADOS POR NOMBRE

	public List<Empleado> listarEmpleadoTrabajo(String trabajo); // LISTA EMPLEADOS POR TRABAJO

	public Empleado actualizarEmpleado(Empleado empleado); // ACTUALIZA DATOS DEL EMPLEADO

	public void deleteEmpleado(Long id); // ELIMINA EL EMPLEADO

}
