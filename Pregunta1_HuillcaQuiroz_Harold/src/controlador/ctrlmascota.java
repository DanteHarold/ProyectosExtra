package controlador;

import modelo.*;
import vista.formulario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dante
 */
public class ctrlmascota implements ActionListener, MouseListener, KeyListener {

    private mascota al;
    private ConsultasMascota cal;
    private formulario form;
    private arreglomascota a;

    public ctrlmascota(mascota al, ConsultasMascota cal, formulario form, arreglomascota a) {
        this.al = al;
        this.cal = cal;
        this.form = form;
        this.a = a;
        /*this.form.btnconsultar.addActionListener(this);
        this.form.btneliminar.addActionListener(this);
        this.form.btnmodificar.addActionListener(this);
        this.form.btninsertar.addActionListener(this);*/
    }

    public void Iniciar() {
        this.form.setLocationRelativeTo(null);
    }

    public void BorrarCB() {
        form.txtestado.removeAllItems();
        form.txtsexo.removeAllItems();
        form.txtespecie.removeAllItems();
    }

    public void AgregarCB() {
        String[] especies = {"-", "P", "G"};
        DefaultComboBoxModel model1 = new DefaultComboBoxModel(especies);
        form.txtespecie.setModel(model1);
        String[] sexos = {"-", "M", "H"};
        DefaultComboBoxModel model2 = new DefaultComboBoxModel(sexos);
        form.txtsexo.setModel(model2);
        String[] estados = {"-", "A", "B"};
        DefaultComboBoxModel model3 = new DefaultComboBoxModel(estados);
        form.txtestado.setModel(model3);
    }

    public void Limpiar() {
        form.txtidmascota.setText("");
        form.txtnombre.setText("");
        form.txtespecie.setSelectedIndex(0);
        form.txtsexo.setSelectedIndex(0);
        form.txtubicacion.setText("");
        form.txtestado.setSelectedIndex(0);
        //form.lblresu.setText("");
        form.txtconsulta.setText("");
        AgregarCB();
    }

    public boolean Verificar() {
        if (form.txtidmascota.equals("")) {
            return false;
        } else if (form.txtnombre.equals("")) {
            return false;
        } else if (form.txtespecie.getSelectedIndex() == 0) {
            return false;
        } else if (form.txtsexo.getSelectedIndex() == 0) {
            return false;
        } else if (form.txtubicacion.equals("")) {
            return false;
        } else if (form.txtestado.getSelectedIndex() == 0) {
            return false;
        } else {
            return true;
        }
    }

    public boolean VerificarIgualdad(int valor) {
        boolean band = false;
        for (int i = 0; i < a.Size(); i++) {
            if (a.Obtener(i).getId_mascota() == valor) {
                band = true;
                break;
            } else {
                band = false;
            }
        }
        return band;
    }

    public void ListarMascotas() {
        DefaultTableModel modelo = new DefaultTableModel();
        form.jtablemascotas.setModel(modelo);
        modelo.setRowCount(0);
        modelo.addColumn("ID_Mascota");
        modelo.addColumn("Nombre");
        modelo.addColumn("Especie");
        modelo.addColumn("Sexo");
        modelo.addColumn("Ubicacion");
        modelo.addColumn("Estado");
        Object[] filas = new Object[6];
        int[] tamano = {50, 50, 50, 20, 50, 20};
        for (int i = 0; i < 6; i++) {
            form.jtablemascotas.getColumnModel().getColumn(i).setPreferredWidth(tamano[i]);
        }
        if (cal.Listar(a)) {

            for (int i = 0; i < a.Size(); i++) {
                //System.out.println(a.Obtener(i).getCodigo());
                filas[0] = a.Obtener(i).getId_mascota();
                filas[1] = a.Obtener(i).getNombre();
                filas[2] = a.Obtener(i).getEspecie();
                filas[3] = a.Obtener(i).getSexo();
                filas[4] = a.Obtener(i).getUbicacion();
                filas[5] = a.Obtener(i).getEstado();
                modelo.addRow(filas);
            }

        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == form.btnlimpiar) {
            Limpiar();
        }
        if (e.getSource() == form.btninsertar) {

            if (Verificar()) {
                if (!VerificarIgualdad(Integer.parseInt(form.txtidmascota.getText()))) {
                    al.setId_mascota(Integer.parseInt(form.txtidmascota.getText()));
                    al.setNombre(form.txtnombre.getText());
                    al.setEspecie(form.txtespecie.getSelectedItem().toString().charAt(0));
                    al.setSexo(form.txtsexo.getSelectedItem().toString().charAt(0));
                    al.setUbicacion(form.txtubicacion.getText().trim());
                    al.setEstado(form.txtestado.getSelectedItem().toString().charAt(0));
                    if (cal.Registrar(al)) {
                        form.lblresu.setText("REGISTRO AGREGADO EXITOSAMENTE");
                        ListarMascotas();
                        Limpiar();
                    } else {
                        form.lblresu.setText("REGISTRO NO AGREGADO - ERROR");
                        Limpiar();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "ID Repetido!");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Por Favor Complete los Cuadros Requeridos!");
            }
        }
        if (e.getSource() == form.btnmodificar) {
            al.setId_mascota(Integer.parseInt(form.txtidmascota.getText()));
            al.setNombre(form.txtnombre.getText());
            al.setEspecie(form.txtespecie.getSelectedItem().toString().charAt(0));
            al.setSexo(form.txtsexo.getSelectedItem().toString().charAt(0));
            al.setUbicacion(form.txtubicacion.getText().trim());
            al.setEstado(form.txtestado.getSelectedItem().toString().charAt(0));
            if (cal.Modificar(al)) {
                form.lblresu.setText("REGISTRO MODIFICADO EXITOSAMENTE");
                ListarMascotas();
                Limpiar();
            } else {
                form.lblresu.setText("REGISTRO NO MODIFICADO - ERROR");
                Limpiar();
            }

        }
        if (e.getSource() == form.btneliminar) {
            if (Verificar()) {
                al.setId_mascota(Integer.parseInt(form.txtidmascota.getText()));
            } else {
                JOptionPane.showMessageDialog(null, "Por Favor Complete los Cuadros Requeridos!");
            }
            if (cal.Eliminar(al)) {
                form.lblresu.setText("REGISTRO Eliminado EXITOSAMENTE");
                ListarMascotas();
                Limpiar();
            } else {
                form.lblresu.setText("REGISTRO NO Eliminado - ERROR");
                Limpiar();
            }
        }
        if (e.getSource() == form.btnconsultar) {
            al.setId_mascota(Integer.parseInt(form.txtconsulta.getText()));
            if (cal.Buscar(al)) {
                form.txtidmascota.setText(String.valueOf(al.getId_mascota()));
                form.txtnombre.setText(al.getNombre());
                form.txtespecie.setSelectedItem("" + al.getEspecie());
                form.txtsexo.setSelectedItem("" + al.getSexo());
                form.txtubicacion.setText(al.getUbicacion());
                form.txtestado.setSelectedItem("" + al.getEstado());
                form.lblresu.setText("REGISTRO Encontrado EXITOSAMENTE");
            } else {
                form.lblresu.setText("REGISTRO NO Encontrado - ERROR");
                Limpiar();
            }
        }
        if (e.getSource() == form.btnlistar) {
            ListarMascotas();
        }
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        if (me.getSource() == form.jtablemascotas) {
            int fila = form.jtablemascotas.getSelectedRow();
            String ID_M = form.jtablemascotas.getValueAt(fila, 0).toString();
            al.setId_mascota(Integer.parseInt(ID_M));
            if (cal.Buscar(al)) {
                form.txtidmascota.setText(String.valueOf(al.getId_mascota()));
                form.txtnombre.setText(al.getNombre());
                form.txtespecie.setSelectedItem("" + al.getEspecie());
                form.txtsexo.setSelectedItem("" + al.getSexo());
                form.txtubicacion.setText(al.getUbicacion());
                form.txtestado.setSelectedItem("" + al.getEstado());
                form.lblresu.setText("REGISTRO Encontrado EXITOSAMENTE");
            } else {
                form.lblresu.setText("REGISTRO NO Enconntrado - ERROR");
                Limpiar();
            }
        }

    }

    @Override
    public void mousePressed(MouseEvent me) {

    }

    @Override
    public void mouseReleased(MouseEvent me) {

    }

    @Override
    public void mouseEntered(MouseEvent me) {

    }

    @Override
    public void mouseExited(MouseEvent me) {
    }

    @Override
    public void keyTyped(KeyEvent ke) {
    }

    @Override
    public void keyPressed(KeyEvent ke) {
    }

    @Override
    public void keyReleased(KeyEvent ke) {

        if (ke.getSource() == form.jtablemascotas) {
            if ((ke.getKeyCode() == KeyEvent.VK_UP) || (ke.getKeyCode() == KeyEvent.VK_DOWN)) {
                int fila = form.jtablemascotas.getSelectedRow();
                String ID_M = form.jtablemascotas.getValueAt(fila, 0).toString();
                al.setId_mascota(Integer.parseInt(ID_M));
                if (cal.Buscar(al)) {
                    form.txtidmascota.setText(String.valueOf(al.getId_mascota()));
                    form.txtnombre.setText(al.getNombre());
                    form.txtespecie.setSelectedItem("" + al.getEspecie());
                    form.txtsexo.setSelectedItem("" + al.getSexo());
                    form.txtubicacion.setText(al.getUbicacion());
                    form.txtestado.setSelectedItem("" + al.getEstado());
                    form.lblresu.setText("REGISTRO Encontrado EXITOSAMENTE");
                } else {
                    form.lblresu.setText("REGISTRO NO Encontrado - ERROR");
                    Limpiar();
                }
            }
        }
    }

}
