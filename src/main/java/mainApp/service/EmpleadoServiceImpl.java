package mainApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mainApp.dao.IEmpleadoDAO;
import mainApp.dto.Empleado;

@Service
public class EmpleadoServiceImpl implements IEmpleadoService {

	@Autowired
	IEmpleadoDAO iEmpleadoDAO;
	
	public List<Empleado> listaEmpleados() {
		return iEmpleadoDAO.findAll();
	}; // LISTAR TODOS LOS EMPLEADOS

	public Empleado addEmpleado(Empleado empleado) {
		return iEmpleadoDAO.save(empleado);
	}; // ADD NUEVO EMPLEADO

	public Empleado getEmpleadoById(Long id) {
		return iEmpleadoDAO.findById(id).get();
	}; // GET EMPLEADO BY ID

	public Empleado actualizarEmpleado(Empleado empleado) {
		return iEmpleadoDAO.save(empleado);
	}

	public void deleteEmpleado(Long id) {
		iEmpleadoDAO.deleteById(id);
	}

	public List<Empleado> listarEmpleadoNombre(String nombre) {
		return iEmpleadoDAO.findByNombre(nombre);
	}
	
	public List<Empleado> listarEmpleadoTrabajo(String trabajo){
		return iEmpleadoDAO.findByTrabajo(trabajo);
	}
	

}
