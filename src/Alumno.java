
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    JButton btnLeccion = new JButton("Lecciones");
    JButton btnTutorial = new JButton("Tutorial");
    JButton btnConfiguracion = new JButton("Configuracion");
    JButton btnRecursos = new JButton("Recursos");
    JButton btnCerrar = new JButton("Cerrar Sesion");
    JButton btnCancelar = new JButton("Cancelar");
    JButton btnCacelar2 = new JButton("Cancelar");
    JButton btnRegresar = new JButton("Regresar");
    JButton btnCorreo = new JButton("Actualizar Correo");
    JButton btnContraseña = new JButton("Actualizar contraseña");
    JButton btnActualizarCorreo = new JButton("Actualiar correo");
    JButton btnRegresar2 = new JButton("Regresar"); 
    JButton btnActualizarContra = new JButton("Actualizar contraseña");
    JButton btnRegresarContra = new JButton("Regresar");
    JButton btnRompecabezas = new JButton("Rompecabezas");
    JButton btnCuestionario = new JButton("Cuestionario");
    JButton btnConceptos = new JButton("Union de Conceptos");
    
    JPanel contenedor = new JPanel();
    JPanel inicio = new JPanel();
    JPanel leccion = new JPanel();
    JPanel perfil = new JPanel();
    JPanel configuracion = new JPanel();
    JPanel pnlRecursos = new JPanel();
    JPanel fondo = new JPanel();
    JPanel actualizarCorreo = new JPanel();
    JPanel actualizarContra = new JPanel();
    
    CardLayout cal = new CardLayout();
    JLabel fotoP = new JLabel();
    JLabel inicioP = new JLabel();
    JLabel lblRecursosA = new JLabel();
    JLabel AgregaP = new JLabel();
    JLabel AdminP = new JLabel();
    JLabel removerP = new JLabel();
    JLabel configuracionP = new JLabel();
    JLabel correoP = new JLabel();
    JLabel contraP = new JLabel();
    JLabel lblTutorial = new JLabel();
    
    public Alumno(){
        //Imangen de foto de perfil
        fotoP.setIcon(new ImageIcon(".\\src\\image\\s.png"));
        fotoP.setBounds(100,0,150,100);
        //Imagen de inicio
        inicioP.setIcon(new ImageIcon(".\\src\\image\\inicioAlu.png"));
        inicioP.setBounds(0,0,500,200);
        //Imagen de Grupo
        lblRecursosA.setIcon(new ImageIcon(".\\src\\image\\recursos.png"));
        lblRecursosA.setBounds(250,60,1080,380);
        pnlRecursos.setLayout(null);
        
        configuracionP.setIcon(new ImageIcon(".\\src\\image\\configuracion.png"));
        configuracionP.setBounds(0,50,1011,261);
        configuracion.setLayout(null);
        
        correoP.setIcon(new ImageIcon(".\\src\\image\\ActualizarCorreo.png"));
        correoP.setBounds(200,80,705,235);
        actualizarCorreo.setLayout(null);
        
        contraP.setIcon(new ImageIcon(".\\src\\image\\AdminContraseña.png"));
        contraP.setBounds(100,80,865,300);
        actualizarContra.setLayout(null);
        
        lblTutorial.setIcon(new ImageIcon(".\\src\\image\\tutorial.png"));
        lblTutorial.setBounds(250,65,1080,400);
        perfil.setLayout(null);
        
        leccion.setLayout(null);
        
        fondo.setBackground(Color.WHITE);
        fondo.setLayout(null);
        fondo.setBounds(0, 0,1080,100);
        
       
        //color de botones
        btnActualizarCorreo.setBackground(Color.GREEN);
        btnRegresar2.setBackground(Color.GREEN);
        btnContraseña.setBackground(Color.GREEN);
        btnCorreo.setBackground(Color.GREEN);
        btnRegresar.setBackground(Color.GREEN);
        btnCacelar2.setBackground(Color.GRAY.darker());
        btnCancelar.setBackground(Color.GRAY.darker());
        btnInicio.setBackground(Color.GRAY.darker());
        btnLeccion.setBackground(Color.GRAY.darker());
        btnTutorial.setBackground(Color.GRAY.darker());
        btnConfiguracion.setBackground(Color.GRAY.darker());
        btnRecursos.setBackground(Color.GRAY.darker());
        btnCerrar.setBackground(Color.GRAY.darker());
        btnRegresarContra.setBackground(Color.GREEN);
        btnActualizarContra.setBackground(Color.GREEN);
        btnRompecabezas.setBackground(Color.RED);
        btnCuestionario.setBackground(Color.BLUE);
        btnConceptos.setBackground(Color.GREEN);
        
        //Color de letra de botones
        btnRegresarContra.setForeground(Color.WHITE);
        btnActualizarContra.setForeground(Color.WHITE);
        btnActualizarCorreo.setForeground(Color.WHITE);
        btnRegresar2.setForeground(Color.WHITE);
        btnCorreo.setForeground(Color.WHITE);
        btnContraseña.setForeground(Color.WHITE);
        btnRegresar.setForeground(Color.WHITE);
        btnCacelar2.setForeground(Color.WHITE);
        btnInicio.setForeground(Color.WHITE);
        btnLeccion.setForeground(Color.WHITE);
        btnTutorial.setForeground(Color.WHITE);
        btnRecursos.setForeground(Color.WHITE);
        btnCerrar.setForeground(Color.WHITE);
        btnConfiguracion.setForeground(Color.WHITE);
        btnCancelar.setForeground(Color.WHITE);
        btnRompecabezas.setForeground(Color.WHITE);
        btnCuestionario.setForeground(Color.WHITE);
        btnConceptos.setForeground(Color.WHITE);
       
        //Card Layout
        contenedor.setLayout(cal);
        contenedor.setBounds(0,100,1080,700);
        
        //Color de paneles
        actualizarContra.setBackground(Color.WHITE);
        actualizarCorreo.setBackground(Color.WHITE);
        inicio.setBackground(Color.WHITE);
        leccion.setBackground(Color.WHITE);
        perfil.setBackground(Color.WHITE);
        configuracion.setBackground(Color.WHITE);
        pnlRecursos.setBackground(Color.WHITE);
        

        //Dimension de los paneles
        actualizarContra.setMaximumSize(new Dimension(500,200));
        actualizarCorreo.setMaximumSize(new Dimension(500,200));
        contenedor.setMaximumSize(new Dimension(500,200));
        inicio.setMaximumSize(new Dimension(500,200)); 
        perfil.setMaximumSize(new Dimension(500,200));
        configuracion.setMaximumSize(new Dimension(500,200));
        pnlRecursos.setMaximumSize(new Dimension(500,200));
        
        
       
       //Agregacion de inicio
       inicio.add(inicioP);
       pnlRecursos.add(lblRecursosA);
       //Agregacion de leccion
       leccion.add(btnRompecabezas);
       leccion.add(btnCuestionario);
       leccion.add(btnConceptos);
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
       perfil.add(lblTutorial);
       //Agregacion de botones al fondo
       fondo.add(fotoP);
       fondo.add(btnInicio); 
       fondo.add(btnLeccion);
       fondo.add(btnRecursos);
       fondo.add(btnTutorial);
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
        btnCacelar2.setBounds(750,400, 100, 50);
        btnCancelar.setBounds(600,330, 100, 50);
        btnInicio.setBounds(480,20,80,50);
        btnLeccion.setBounds(560,20,100,50);
        btnRecursos.setBounds(660,20,100,50);
        btnTutorial.setBounds(750,20,80,50);
        btnConfiguracion.setBounds(830,20,120,50);
        btnCerrar.setBounds(950,20,120,50);
        btnRompecabezas.setBounds(500, 150, 150, 50);
        btnCuestionario.setBounds(500, 250, 150, 50);
        btnConceptos.setBounds(500, 350, 150, 50);
        
        //Capas del Card
        contenedor.add(inicio,"1");
        contenedor.add(leccion,"2");
        contenedor.add(pnlRecursos,"3");
        contenedor.add(perfil,"4");
        contenedor.add(configuracion,"5");
        /*contenedor.add(AgregarAlum,"6");
        contenedor.add(AdminAlum,"7");
        contenedor.add(RemoverAlum,"8");*/
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
             
              btnTutorial.addActionListener(new ActionListener() {
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
               
                btnRecursos.addActionListener(new ActionListener() {
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
             
              btnCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cal.show(contenedor,"3");
            }
        });
              
            btnCacelar2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cal.show(contenedor,"3");
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
                 btnRompecabezas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Abriendo Editor");
                ProcessBuilder pb = new ProcessBuilder("java", "-jar", ".\\JigsawJars\\jigsawpuzzle.jar");
                try {
                    Process p = pb.start();
                    System.out.println("Abriendo archivo jar");
                } catch (IOException ex) {
                    Logger.getLogger(Docente.class.getName()).log(Level.SEVERE, null, ex);
                }
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

