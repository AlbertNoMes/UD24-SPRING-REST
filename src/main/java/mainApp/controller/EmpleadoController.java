package mainApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mainApp.dto.Empleado;
import mainApp.service.EmpleadoServiceImpl;

@RestController
@RequestMapping("/api")
public class EmpleadoController {

	@Autowired
	EmpleadoServiceImpl empleadoServiceImpl;

	@GetMapping("/empleados")
	public List<Empleado> listaEmpleados() {
		return empleadoServiceImpl.listaEmpleados();
	}

	@PostMapping("/empleados")
	public Empleado addNewEmpleado(@RequestBody Empleado empleado) {
		return empleadoServiceImpl.addEmpleado(empleado);
	}

	@GetMapping("/empleados/{id}")
	public Empleado getEmpById(@PathVariable(name = "id") Long id) {
		Empleado ep1 = new Empleado();
		ep1 = empleadoServiceImpl.getEmpleadoById(id);
		System.out.println(ep1);
		return ep1;
	}

	@PutMapping("/empleados/{id}")
	public Empleado actualizarEmpleado(@PathVariable(name = "id") Long id, @RequestBody Empleado empleado) {
		Empleado ep_select = new Empleado();
		Empleado ep_update = new Empleado();
		ep_select = empleadoServiceImpl.getEmpleadoById(id);
		ep_select.setNombre(empleado.getNombre());
		ep_select.setApellido(empleado.getApellido());
		ep_select.setDireccion(empleado.getDireccion());
		ep_select.setDni(empleado.getDni());
		ep_select.setFecha(empleado.getFecha());
		ep_select.setTrabajo(empleado.getTrabajo());

		ep_update = empleadoServiceImpl.addEmpleado(ep_select);
		System.out.println("El empleado actualizado es: " + ep_update);

		return ep_update;

	}

	@DeleteMapping("/empleados/{id}")
	public void deleteEmpleado(@PathVariable(name = "id") Long id) {
		empleadoServiceImpl.deleteEmpleado(id);
	}
	
	//hola
	
}
