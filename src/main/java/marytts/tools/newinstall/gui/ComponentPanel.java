/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package marytts.tools.newinstall.gui;

import java.awt.Dimension;
import java.io.IOException;
import java.text.ParseException;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingWorker;

import marytts.tools.newinstall.Installer;
import marytts.tools.newinstall.enums.Status;
import marytts.tools.newinstall.objects.Component;
import marytts.tools.newinstall.objects.VoiceComponent;

import org.apache.log4j.Logger;

/**
 * Swing.JPanel used to display one component within the {@link InstallerGUI}
 * 
 * @author Jonathan
 */
public class ComponentPanel extends JPanel {

	private Installer installer;

	private Component component;

	// used for resizing purposes of the collapse functionality
	private int collapsedHeight;
	private int uncollapsedHeight;

	// used to check if ComponentPanel is collapsed for the first time, if yes, heights for uncollapsed and for collapsed states
	// are set
	private boolean firstCollapse;

	static Logger logger = Logger.getLogger(marytts.tools.newinstall.gui.ComponentPanel.class.getName());

	/**
	 * Creates new form ComponentPanel
	 * 
	 * @param component
	 * 
	 * @param installer
	 *            the installer instance
	 */
	public ComponentPanel(Component component, Installer installer) {

		this.component = component;
		this.installer = installer;
		this.firstCollapse = true;
		initComponents();
		fillFields(component);
	}

	/* @formatter:off
	
	/**
	 * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of
	 * this method is always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        localeValueLabel = new javax.swing.JLabel();
        localeLabel = new javax.swing.JLabel();
        genderLabel = new javax.swing.JLabel();
        genderValueLabel = new javax.swing.JLabel();
        typeLabel = new javax.swing.JLabel();
        typeValueLabel = new javax.swing.JLabel();
        collapsiblePanel = new javax.swing.JPanel();
        versionValueLabel = new javax.swing.JLabel();
        licenseLabel = new javax.swing.JLabel();
        licenseValueLabel = new javax.swing.JLabel();
        versionLabel = new javax.swing.JLabel();
        jTextArea1 = new javax.swing.JTextArea();
        sizeLabel = new javax.swing.JLabel();
        sizeValueLabel = new javax.swing.JLabel();
        unInstallButton = new javax.swing.JButton();
        statusLabel = new javax.swing.JLabel();
        componentNameLabel = new javax.swing.JLabel();
        collapseButton = new javax.swing.JToggleButton();

        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setToolTipText("");
        setMaximumSize(new java.awt.Dimension(32767, 63));
        setMinimumSize(new java.awt.Dimension(535, 63));
        setPreferredSize(new java.awt.Dimension(535, 63));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        localeValueLabel.setText("jLabel");

        localeLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        localeLabel.setText("Locale:");

        genderLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        genderLabel.setText("Gender:");

        genderValueLabel.setText("jLabel6");

        typeLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        typeLabel.setText("Type:");

        typeValueLabel.setText("jLabel6");

        collapsiblePanel.setPreferredSize(new java.awt.Dimension(0, 0));

        versionValueLabel.setText("jLabel4");

        licenseLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        licenseLabel.setText("License:");

        licenseValueLabel.setText("jLabel6");

        versionLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        versionLabel.setText("Version:");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Courier New", 0, 10)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setBorder(javax.swing.BorderFactory.createTitledBorder("Description"));
        jTextArea1.setMaximumSize(new java.awt.Dimension(132, 30));
        jTextArea1.setPreferredSize(new java.awt.Dimension(132, 40));

        javax.swing.GroupLayout collapsiblePanelLayout = new javax.swing.GroupLayout(collapsiblePanel);
        collapsiblePanel.setLayout(collapsiblePanelLayout);
        collapsiblePanelLayout.setHorizontalGroup(
            collapsiblePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(collapsiblePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(versionLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(versionValueLabel)
                .addGap(115, 115, 115)
                .addComponent(licenseLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(licenseValueLabel)
                .addGap(153, 153, 153))
            .addGroup(collapsiblePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        collapsiblePanelLayout.setVerticalGroup(
            collapsiblePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(collapsiblePanelLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jTextArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(collapsiblePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(licenseLabel)
                    .addComponent(licenseValueLabel)
                    .addComponent(versionLabel)
                    .addComponent(versionValueLabel)))
        );

        sizeLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        sizeLabel.setText("Size:");

        sizeValueLabel.setText("jLabel6");

        unInstallButton.setText("Install");
        unInstallButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                installButtonActionPerformed(evt);
            }
        });

        statusLabel.setText("jLabel2");

        componentNameLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        componentNameLabel.setText("jLabel1");

        collapseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button_icon.png"))); // NOI18N
        collapseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                collapseButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(collapsiblePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(componentNameLabel)
                            .addComponent(collapseButton))
                        .addGap(12, 12, 12)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(localeLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(localeValueLabel)
                                .addGap(18, 18, 18)
                                .addComponent(sizeLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sizeValueLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(genderLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(genderValueLabel)
                                .addGap(18, 18, 18)
                                .addComponent(typeLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(typeValueLabel)))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(statusLabel))
                            .addComponent(unInstallButton))))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(genderLabel)
                                .addComponent(genderValueLabel)
                                .addComponent(typeLabel)
                                .addComponent(typeValueLabel)))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(localeLabel)
                            .addComponent(localeValueLabel)
                            .addComponent(sizeLabel)
                            .addComponent(sizeValueLabel)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(statusLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(unInstallButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(componentNameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(collapseButton)))
                .addGap(11, 11, 11)
                .addComponent(collapsiblePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
	/* @formatter:on */

	private void installButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_installButtonActionPerformed
		if (this.component == null) {
			logger.error("Can not (un)install as component is null!");
			return;
		} else if (this.installer == null) {
			logger.error("Can not (un)install as installer instance is null");
			return;
		}

		if (this.unInstallButton.getText().equals("Install")) {
			// a different thread is used for the installation so as to ensure that the GUI stays responsive during the (possibly
			// long) installation
			SwingWorker installThread = new SwingWorker<Void, Void>() {

				@Override
				public Void doInBackground() {
					try {
						// if component is already installed, there is no need to reinstall.
						if (ComponentPanel.this.component.getStatus() == Status.INSTALLED) {
							String componentName = ComponentPanel.this.component.getName();
							logger.info(componentName + " is already installed");
							JOptionPane.showMessageDialog(ComponentPanel.this, "Component is already installed!",
									"Installing component " + componentName, JOptionPane.INFORMATION_MESSAGE);
						} else {
							ComponentPanel.this.unInstallButton.setText("Installing ...");
							ComponentPanel.this.installer.install(ComponentPanel.this.component);
							ComponentPanel.this.unInstallButton.setText("Uninstall");
							ComponentPanel.this.installer.updateResourceStatuses();
						}
					} catch (ParseException pe) {
						logger.error("ParseException: " + pe.getMessage());
					} catch (IOException ioe) {
						logger.error("IOException: " + ioe.getMessage());
					}
					return null;
				}
			};

			installThread.execute();

		} else if (this.unInstallButton.getText().equals("Uninstall")) {
			// a different thread is used for the installation so as to ensure that the GUI stays responsive during the (possibly
			// long) installation
			SwingWorker uninstallThread = new SwingWorker<Void, Void>() {

				@Override
				public Void doInBackground() {
					// if component is already installed, there is no need to reinstall.
					if (ComponentPanel.this.component.getStatus() != Status.INSTALLED) {
						String componentName = ComponentPanel.this.component.getName();
						logger.info(componentName + " is not installed");
						JOptionPane.showMessageDialog(ComponentPanel.this, "Component is not installed!", "Installing component "
								+ componentName, JOptionPane.INFORMATION_MESSAGE);
					} else {
						ComponentPanel.this.unInstallButton.setText("Uninstalling ...");
						ComponentPanel.this.installer.uninstall(ComponentPanel.this.component);
						ComponentPanel.this.unInstallButton.setText("Install");
						ComponentPanel.this.installer.updateResourceStatuses();
					}
					return null;
				}
			};
			uninstallThread.execute();
		} else {
			logger.warn("\"" + this.unInstallButton.getText() + "\" is not a valid option");
		}
	}// GEN-LAST:event_installButtonActionPerformed

	public void setResourceStatus(String resultString) {

		this.statusLabel.setText(resultString);
	}

	private void collapseButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_collapseButtonActionPerformed

		// if panel is collapsed for the first time, its uncollapsed and collapsed height are computed.
		if (this.firstCollapse) {
			this.collapsedHeight = this.collapseButton.getBounds().y + this.collapseButton.getBounds().height + 4;
			this.uncollapsedHeight = this.collapsiblePanel.getBounds().y + this.collapsiblePanel.getBounds().height + 4;
			this.firstCollapse = false;
		}

		logger.debug("PS before: " + this.getPreferredSize());

		if (this.collapseButton.isSelected()) {
			this.setPreferredSize(new Dimension(this.getPreferredSize().width, this.uncollapsedHeight));
		} else {
			this.setPreferredSize(new Dimension(this.getWidth(), this.collapsedHeight));
		}

		logger.debug("PS after: " + this.getPreferredSize());

		this.revalidate();
		this.repaint();
		this.getParent().getParent().repaint();

	}// GEN-LAST:event_collapseButtonActionPerformed

	/**
	 * Is called at loading time of this panel. Fills all JLabels and JTextAreas with the necessary information from the component
	 * 
	 * @param component
	 */
	private void fillFields(Component component) {
		this.componentNameLabel.setText(component.getDisplayName());
		this.jTextArea1.setText(component.getDescription().replaceAll("[\\t\\n]", " ").replaceAll("( )+", " "));
		this.versionValueLabel.setText(component.getVersion());
		this.licenseValueLabel.setText(component.getLicenseName());
		// this.sizeValueLabel.setText(FileUtils.byteCountToDisplaySize(component.getSize()));
		this.statusLabel.setText(component.getStatus().toString());
		this.localeValueLabel.setText(component.getLocale().toString());

		// TODO solve this in a better way
		// if component is a VoiceComponent
		if (component instanceof VoiceComponent) {
			this.typeValueLabel.setText(((VoiceComponent) component).getType());
			this.genderValueLabel.setText(((VoiceComponent) component).getGender());
		} else {
			this.typeLabel.setVisible(false);
			this.typeValueLabel.setVisible(false);
			this.genderLabel.setVisible(false);
			this.genderValueLabel.setVisible(false);
		}
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JToggleButton collapseButton;
	private javax.swing.JPanel collapsiblePanel;
	private javax.swing.JLabel componentNameLabel;
	private javax.swing.JLabel genderLabel;
	private javax.swing.JLabel genderValueLabel;
	private javax.swing.JButton unInstallButton;
	private javax.swing.JSeparator jSeparator1;
	private javax.swing.JTextArea jTextArea1;
	private javax.swing.JLabel licenseLabel;
	private javax.swing.JLabel licenseValueLabel;
	private javax.swing.JLabel localeLabel;
	private javax.swing.JLabel localeValueLabel;
	private javax.swing.JLabel sizeLabel;
	private javax.swing.JLabel sizeValueLabel;
	private javax.swing.JLabel statusLabel;
	private javax.swing.JLabel typeLabel;
	private javax.swing.JLabel typeValueLabel;
	private javax.swing.JLabel versionLabel;
	private javax.swing.JLabel versionValueLabel;
	// End of variables declaration//GEN-END:variables

}
