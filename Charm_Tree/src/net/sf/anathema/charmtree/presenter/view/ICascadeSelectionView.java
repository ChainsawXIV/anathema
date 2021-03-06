package net.sf.anathema.charmtree.presenter.view;

import net.disy.commons.swing.action.SmartAction;
import net.sf.anathema.lib.control.objectvalue.IObjectValueChangedListener;
import net.sf.anathema.lib.util.IIdentificate;
import net.sf.anathema.platform.svgtree.presenter.view.IDocumentLoadedListener;

import javax.swing.*;
import java.awt.*;

public interface ICascadeSelectionView {

  CharmTreeRenderer getCharmTreeRenderer();

  void addDocumentLoadedListener(IDocumentLoadedListener listener);

  void addCharmTypeSelector(String title, IIdentificate[] types, ListCellRenderer renderer);

  void addCharmTypeSelectionListener(IObjectValueChangedListener<IIdentificate> selectionListener);
  
  void addCharmFilterButton(SmartAction action, String titleText, String buttonText);

  void fillCharmGroupBox(IIdentificate[] charmGroups);

  void fillCharmTypeBox(IIdentificate[] cascadeTypes);

  void addCharmGroupSelector(
      String title,
      ListCellRenderer renderer,
      ICharmGroupChangeListener selectionListener,
      Dimension preferredSize);
}