
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class listagemVendidosVIEW extends javax.swing.JFrame {

    public listagemVendidosVIEW() {
        initComponents();
    //    preencherTblVendidos();
    }


    /*private void preencherTblVendidos() {
        ProdutosDAO produtosdao = new ProdutosDAO();
        List<ProdutosDTO> listaProdutosVendidos = produtosdao.listarProdutosVendidos();
        
        DefaultTableModel model = (DefaultTableModel) tabelaProdutosvendidos.getModel();
        model.setRowCount(0);
        
        for (ProdutosDTO produto : listaProdutosVendidos) {
            Object[] row = new Object[]{
                produto.getId(),
                produto.getNome(),
                produto.getValor(),
                produto.getStatus()
            };
            model.addRow(row);
        }
    }
*/
    private void initComponents() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    

  
}
