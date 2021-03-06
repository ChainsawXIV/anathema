package net.sf.anathema.character.presenter;

import javax.swing.Icon;

import net.disy.commons.swing.icon.EmptyIcon;
import net.sf.anathema.character.generic.caste.ICasteType;
import net.sf.anathema.character.generic.rules.IExaltedEdition;
import net.sf.anathema.character.generic.template.presentation.IPresentationProperties;
import net.sf.anathema.lib.resources.AbstractUI;
import net.sf.anathema.lib.resources.IResources;

import java.awt.*;

public class CasteUI extends AbstractUI {

  private final IExaltedEdition edition;
  private final IPresentationProperties properties;

  public CasteUI(IResources resources, IExaltedEdition edition, IPresentationProperties properties) {
    super(resources);
    this.edition = edition;
    this.properties = properties;
  }

  public Icon getSmallCasteIcon(ICasteType type) {
    return getIcon(properties.getSmallCasteIconResource(type.getId(), edition.getId()));
  }

  public Icon getEmptyIcon() {
    return new EmptyIcon(new Dimension(16, 16));
  }
}