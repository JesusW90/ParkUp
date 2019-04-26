package dao;

import beans.Usuario;
import beans.Vehiculo;

public class PruebaUsuarioVehiculoDao {
    
        public static void main(String[] args){
        
        /*
       Usuario u1 = new Usuario();

        u1.setNombre("Andreu");
        u1.setApellido("Buenafuente");
        u1.setDNI("07963412F");
        u1.setTelefono(689523147);
        u1.setEmail("jfjksfd@gmail.com");
        u1.setPass("miPassword");
     

        
        UsuarioDao miUsuarioDao = new UsuarioDao();
        miUsuarioDao.registrarUsuario(u1);
        
        
        
        Vehiculo v1 = new Vehiculo();
        
        v1.setMatricula("3777CFD");
        v1.setTipovehiculo("coche");
        v1.setElectrico(false);
        v1.setUsuario(u1);
        
        
        Vehiculo v2 = new Vehiculo();
        
        v2.setMatricula("3454HJK");
        v2.setTipovehiculo("furgoneta");
        v2.setElectrico(false);
        v2.setUsuario(u1);
        
        */
        VehiculoDao miVehiculoDao = new VehiculoDao();
        //miVehiculoDao.guardarVehiculo(v1);
        //miVehiculoDao.guardarVehiculo(v2);
        
        //Vehiculo v2 = miVehiculoDao.recuperarVehiculo("3777CFD");
        //System.out.println(v2.getMatricula());
        //System.out.println(v2.getTipovehiculo());
        //System.out.println(v2.isElectrico());
        //System.out.println(v2.getUsuario().getDNI());
        
        //System.out.println(miUsuarioDao.recuperarUsuario("07963412F"));
        //System.out.println(miUsuarioDao.eliminarUsuario("07963412F"));
        
        //System.out.println(miVehiculoDao.recuperarVehiculosDeUsuario(u1));
        //miVehiculoDao.modificarVehiculo(v1);
        miVehiculoDao.eliminarVehiculo("3777CFD");
        
        //miVehiculoDao.eliminarVehiculosDeUsuario(u1);
    }
    
}
