
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jorge
 */
class Alumno extends JPanel{
    JFrame frame = new JFrame();
    JButton btnInicio = new JButton("Inicio");
    JButton btnLeccion = new JButton("Leccion");
    JButton btnPerfil = new JButton("Perfil");
    JButton btnConfiguracion = new JButton("Configuracion");
    JButton btnGrupo = new JButton("Grupo");
    JButton btnCerrar = new JButton("Cerrar Sesion");
    JButton btnAgregar = new JButton("Agregar Alumno");
    JButton btnAdministrar = new JButton("Administrar Calificacion");
    JButton btnAceptar = new JButton("Aceptar");
    JButton btnCancelar = new JButton("Cancelar");
    JButton btnCacelar2 = new JButton("Cancelar");
    JButton btnRegresar = new JButton("Regresar");
    JButton btnRemover = new JButton("Remover Alumno");
    JButton btnActualizar = new JButton("Actualizar Alumno");
    JButton btnCorreo = new JButton("Actualizar Correo");
    JButton btnContraseña = new JButton("Actualizar contraseña");
    JButton btnActualizarCorreo = new JButton("Actualiar correo");
    JButton btnRegresar2 = new JButton("Regresar"); 
    JButton btnActualizarContra = new JButton("Actualizar contraseña");
    JButton btnRegresarContra = new JButton("Regresar");
    
    JPanel contenedor = new JPanel();
    JPanel inicio = new JPanel();
    JPanel leccion = new JPanel();
    JPanel perfil = new JPanel();
    JPanel configuracion = new JPanel();
    JPanel grupo = new JPanel();
    JPanel fondo = new JPanel();
    JPanel AgregarAlum = new JPanel();
    JPanel AdminAlum = new JPanel();
    JPanel RemoverAlum = new JPanel();
    JPanel actualizarCorreo = new JPanel();
    JPanel actualizarContra = new JPanel();
    
    CardLayout cal = new CardLayout();
    JLabel fotoP = new JLabel();
    JLabel inicioP = new JLabel();
    JLabel grupoP = new JLabel();
    JLabel AgregaP = new JLabel();
    JLabel AdminP = new JLabel();
    JLabel removerP = new JLabel();
    JLabel configuracionP = new JLabel();
    JLabel correoP = new JLabel();
    JLabel contraP = new JLabel();
    JLabel perfilP = new JLabel();
    
    public Alumno(){
        //Imangen de foto de perfil
        fotoP.setIcon(new ImageIcon(".\\src\\image\\s.png"));
        fotoP.setBounds(100,0,150,100);
        //Imagen de inicio
        inicioP.setIcon(new ImageIcon(".\\src\\image\\inicio.png"));
        inicioP.setBounds(0,0,500,200);
        //Imagen de Agregar alumno
        AgregaP.setIcon(new ImageIcon(".\\src\\image\\agregarAlumno.png"));
        AgregaP.setBounds(200,50,765,336);
        AgregarAlum.setLayout(null);
        //Imagen de Grupo
        grupoP.setIcon(new ImageIcon(".\\src\\image\\adminGrupo.png"));
        grupoP.setBounds(200,100,1080,200);
        grupo.setLayout(null);
        //imagen de Administrar calificacion
        AdminP.setIcon(new ImageIcon(".\\src\\image\\AdminCal.png"));
        AdminP.setBounds(70,50,926,485);
        AdminAlum.setLayout(null);
        //imagen de remover alumno
        removerP.setIcon(new ImageIcon(".\\src\\image\\RemoverAlum.png"));
        removerP.setBounds(40,50,1011,261);
        RemoverAlum.setLayout(null);
        
        configuracionP.setIcon(new ImageIcon(".\\src\\image\\configuracion.png"));
        configuracionP.setBounds(0,50,1011,261);
        configuracion.setLayout(null);
        
        correoP.setIcon(new ImageIcon(".\\src\\image\\ActualizarCorreo.png"));
        correoP.setBounds(200,80,705,235);
        actualizarCorreo.setLayout(null);
        
        contraP.setIcon(new ImageIcon(".\\src\\image\\AdminContraseña.png"));
        contraP.setBounds(100,80,865,300);
        actualizarContra.setLayout(null);
        
        perfilP.setIcon(new ImageIcon(".\\src\\image\\perfil.png"));
        perfilP.setBounds(0,0,1080,400);
        perfil.setLayout(null);
        
        
        fondo.setBackground(Color.WHITE);
        fondo.setLayout(null);
        fondo.setBounds(0, 0,1080,100);
        
       
        //color de botones
        btnActualizarCorreo.setBackground(Color.GREEN);
        btnRegresar2.setBackground(Color.GREEN);
        btnContraseña.setBackground(Color.GREEN);
        btnCorreo.setBackground(Color.GREEN);
        btnRegresar.setBackground(Color.GREEN);
        btnActualizar.setBackground(Color.GRAY.darker());
        btnCacelar2.setBackground(Color.GRAY.darker());
        btnRemover.setBackground(Color.GREEN);
        btnAceptar.setBackground(Color.GRAY.darker());
        btnCancelar.setBackground(Color.GRAY.darker());
        btnInicio.setBackground(Color.GRAY.darker());
        btnLeccion.setBackground(Color.GRAY.darker());
        btnPerfil.setBackground(Color.GRAY.darker());
        btnConfiguracion.setBackground(Color.GRAY.darker());
        btnGrupo.setBackground(Color.GRAY.darker());
        btnCerrar.setBackground(Color.GRAY.darker());
        btnAgregar.setBackground(Color.GREEN);
        btnAdministrar.setBackground(Color.BLUE);
        btnRegresarContra.setBackground(Color.GREEN);
        btnActualizarContra.setBackground(Color.GREEN);
        
        //Color de letra de botones
        btnRegresarContra.setForeground(Color.WHITE);
        btnActualizarContra.setForeground(Color.WHITE);
        btnActualizarCorreo.setForeground(Color.WHITE);
        btnRegresar2.setForeground(Color.WHITE);
        btnCorreo.setForeground(Color.WHITE);
        btnContraseña.setForeground(Color.WHITE);
        btnRegresar.setForeground(Color.WHITE);
        btnActualizar.setForeground(Color.WHITE);
        btnCacelar2.setForeground(Color.WHITE);
        btnRemover.setForeground(Color.WHITE);
        btnInicio.setForeground(Color.WHITE);
        btnLeccion.setForeground(Color.WHITE);
        btnPerfil.setForeground(Color.WHITE);
        btnGrupo.setForeground(Color.WHITE);
        btnCerrar.setForeground(Color.WHITE);
        btnConfiguracion.setForeground(Color.WHITE);
        btnAgregar.setForeground(Color.WHITE);
        btnAdministrar.setForeground(Color.WHITE);
        btnAceptar.setForeground(Color.WHITE);
        btnCancelar.setForeground(Color.WHITE);
       
        //Card Layout
        contenedor.setLayout(cal);
        contenedor.setBounds(0,100,1080,700);
        
        //Color de paneles
        actualizarContra.setBackground(Color.WHITE);
        actualizarCorreo.setBackground(Color.WHITE);
        RemoverAlum.setBackground(Color.WHITE);
        AdminAlum.setBackground(Color.WHITE);
        AgregarAlum.setBackground(Color.WHITE);
        inicio.setBackground(Color.WHITE);
        leccion.setBackground(Color.RED);
        perfil.setBackground(Color.WHITE);
        configuracion.setBackground(Color.WHITE);
        grupo.setBackground(Color.WHITE);
        

        //Dimension de los paneles
        actualizarContra.setMaximumSize(new Dimension(500,200));
        actualizarCorreo.setMaximumSize(new Dimension(500,200));
        RemoverAlum.setMaximumSize(new Dimension(500,200));
        AdminAlum.setMaximumSize(new Dimension(500,200));
        AgregarAlum.setMaximumSize(new Dimension(500,200));
        contenedor.setMaximumSize(new Dimension(500,200));
        inicio.setMaximumSize(new Dimension(500,200)); 
        perfil.setMaximumSize(new Dimension(500,200));
        configuracion.setMaximumSize(new Dimension(500,200));
        grupo.setMaximumSize(new Dimension(500,200));
        
        
        
        
       // agregacion a panel del grupo
       grupo.add(btnAgregar);
       grupo.add(btnAdministrar);
       grupo.add(btnRemover);
       //Agregacion de inicio
       inicio.add(inicioP);
       grupo.add(grupoP);
       //Agregacion de alumno
       AgregarAlum.add(btnCancelar);
       AgregarAlum.add(btnAceptar);
       AgregarAlum.add(AgregaP);
       //Agregacion de administrar calificacion
       AdminAlum.add(btnCacelar2);
       AdminAlum.add(btnActualizar);
       AdminAlum.add(AdminP);
       //Agregacion de Remover alumno
       RemoverAlum.add(removerP);
       RemoverAlum.add(btnRegresar);
       //Agregacion de configuracion
       configuracion.add(configuracionP);
       configuracion.add(btnCorreo);
       configuracion.add(btnContraseña);
       //Agregacion de actualizar correo
       actualizarCorreo.add(btnActualizarCorreo);
       actualizarCorreo.add(btnRegresar2);
       actualizarCorreo.add(correoP);
       //Agregacion de actualizar contraseña
       actualizarContra.add(btnActualizarContra);
       actualizarContra.add(btnRegresarContra);
       actualizarContra.add(contraP);
       //agregacion de perfil
       perfil.add(perfilP);
       //Agregacion de botones al fondo
       fondo.add(fotoP);
       fondo.add(btnInicio); 
       fondo.add(btnLeccion);
       fondo.add(btnGrupo);
       fondo.add(btnPerfil);
       fondo.add(btnConfiguracion);
       fondo.add(btnCerrar);
       //Agregacion al frame
       frame.add(fondo);
       frame.add(contenedor);
       
       
       //Colocacion de botones
        btnActualizarContra.setBounds(400, 400, 170, 50);
        btnRegresarContra.setBounds(600, 400, 100, 50);
        btnRegresar2.setBounds(600, 300,100,50);
        btnActualizarCorreo.setBounds(400, 300, 150, 50);
        btnCorreo.setBounds(500, 300, 150, 50);
        btnContraseña.setBounds(500,370,170,50);
        btnRegresar.setBounds(600,330, 100, 50);
        btnActualizar.setBounds(580,400, 150, 50);
        btnCacelar2.setBounds(750,400, 100, 50);
        btnRemover.setBounds(780,350,150,40);
        btnAceptar.setBounds(450,330, 100, 50);
        btnCancelar.setBounds(600,330, 100, 50);
        btnAgregar.setBounds(780,300,140,40);
        btnAdministrar.setBounds(760,130,180,40);
        btnInicio.setBounds(480,20,80,50);
        btnLeccion.setBounds(560,20,80,50);
        btnGrupo.setBounds(640,20,80,50);
        btnPerfil.setBounds(720,20,80,50);
        btnConfiguracion.setBounds(800,20,120,50);
        btnCerrar.setBounds(920,20,150,50);
        
        //Capas del Card
        contenedor.add(inicio,"1");
        contenedor.add(leccion,"2");
        contenedor.add(grupo,"3");
        contenedor.add(perfil,"4");
        contenedor.add(configuracion,"5");
        contenedor.add(AgregarAlum,"6");
        contenedor.add(AdminAlum,"7");
        contenedor.add(RemoverAlum,"8");
        contenedor.add(actualizarCorreo,"9");
        contenedor.add(actualizarContra,"10");
        
        //Inicializar card
        cal.show(contenedor,"1");
        
       //Configuracion del frame
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setMinimumSize(new Dimension(1080,720));
        frame.setLocation(500,200);
        frame.pack();
        frame.setVisible(true); 
        //Acciones de los botones
        btnLeccion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cal.show(contenedor,"2");
            }
        });

            btnInicio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cal.show(contenedor,"1");
            }
        });
             
              btnPerfil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cal.show(contenedor,"4");
            }
        });
              
               btnConfiguracion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cal.show(contenedor,"5");
            }
        });
               
                btnGrupo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cal.show(contenedor,"3");
            }
        });
                
                 btnCerrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                login inicio = new login();
                inicio.setVisible(true);
            }
        });
                 
            btnAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cal.show(contenedor,"6");
            }
        });
            
             btnAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Alumno agregado correctamente");
                cal.show(contenedor,"3");
            }
        });
             
              btnCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cal.show(contenedor,"3");
            }
        });
              
              btnAdministrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cal.show(contenedor,"7");
            }
        });
              
            btnCacelar2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cal.show(contenedor,"3");
            }
        });
                   
            btnActualizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Calificacion Actualizada Correctamente");
                cal.show(contenedor,"3");
            }
        });
           btnRemover.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cal.show(contenedor,"8");
            }
        });
              
           btnRegresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cal.show(contenedor,"3");
            }
        });
           
            btnCorreo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cal.show(contenedor,"9");
            }
        });
             btnRegresar2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cal.show(contenedor,"5");
            }
        });
             
              btnActualizarCorreo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Correo actualizado correctamente");
                cal.show(contenedor,"5");
            }
        });
              
              btnContraseña.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cal.show(contenedor,"10");
            }
        });
              
               btnActualizarContra.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Contraseña actualizada correctamente");
                cal.show(contenedor,"5");
            }
        });
                 btnRegresarContra.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cal.show(contenedor,"5");
            }
        });
              
    }

    public static void main(String [] args){
        SwingUtilities.invokeLater(new Runnable(){
         @Override
            public void run() {
                new Alumno().setVisible(true);
            }
        });
    }
}

