package ui;

import java.awt.Color;
import java.awt.Component;

import javax.swing.DefaultListCellRenderer;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

public class IComboBoxRenderer implements ListCellRenderer<Object> {

	private DefaultListCellRenderer defaultCellRenderer = new DefaultListCellRenderer();

	public IComboBoxRenderer() {
		super();
	}

	@Override
	public Component getListCellRendererComponent(JList<?> list, Object value,
			   int index, boolean isSelected, boolean cellHasFocus) {
		JLabel renderer = (JLabel) defaultCellRenderer
				.getListCellRendererComponent(list, value, index, isSelected,
						cellHasFocus);
		if (isSelected) {
			//renderer.setBackground(XUtil.defaultComboBoxBoundsColor);
			renderer.setForeground(Color.WHITE);
		} else {
			renderer.setBackground(Color.WHITE);
		}
		//list.setSelectionBackground(XUtil.defaultComboBoxColor);
		list.setBorder(null);
		//renderer.setFont(XUtil.defaultComboBoxFont);
		renderer.setHorizontalAlignment(JLabel.CENTER);
		return renderer;
	}
}