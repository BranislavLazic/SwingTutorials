import javax.swing.*;
import java.math.BigDecimal;

public class JListTutorial {

    JFrame frame = new JFrame("Storage");
    JList<Product> list = new JList<>();
    DefaultListModel<Product> model = new DefaultListModel<>();

    JLabel label = new JLabel();
    JPanel panel = new JPanel();
    JSplitPane splitPane = new JSplitPane();

    public JListTutorial() {

        list.setModel(model);

        model.addElement(new Product("Oranges", new BigDecimal("2.00"), "These are fresh oranges"));
        model.addElement(new Product("Apples", new BigDecimal("1.50"), "These are fresh apples"));

        list.getSelectionModel().addListSelectionListener(e -> {
            Product p = list.getSelectedValue();
            label.setText("Name: " + p.getName() + " ::: " + p.getPrice().toPlainString() + " ::: " + p.getDesc());
        });

        splitPane.setLeftComponent(new JScrollPane(list));
        panel.add(label);
        splitPane.setRightComponent(panel);

        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.add(splitPane);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(JListTutorial::new);
    }

    private class Product {
        String name;
        BigDecimal price;
        String desc;

        public Product(String name, BigDecimal price, String desc) {
            this.name = name;
            this.price = price;
            this.desc = desc;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public BigDecimal getPrice() {
            return price;
        }

        public void setPrice(BigDecimal price) {
            this.price = price;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        @Override
        public String toString() {
            return name;
        }
    }

}
