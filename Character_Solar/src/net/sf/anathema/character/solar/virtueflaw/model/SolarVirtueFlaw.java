package net.sf.anathema.character.solar.virtueflaw.model;

import net.sf.anathema.character.generic.framework.additionaltemplate.model.ICharacterModelContext;
import net.sf.anathema.character.library.virtueflaw.model.VirtueFlaw;
import net.sf.anathema.lib.workflow.textualdescription.ITextualDescription;
import net.sf.anathema.lib.workflow.textualdescription.model.SimpleTextualDescription;

public class SolarVirtueFlaw extends VirtueFlaw implements ISolarVirtueFlaw {

  private final ITextualDescription description = new SimpleTextualDescription(""); //$NON-NLS-1$
  private final ITextualDescription limitBreak = new SimpleTextualDescription(""); //$NON-NLS-1$

  public SolarVirtueFlaw(ICharacterModelContext context)
  {
	  super(context);
  }
  
  public ITextualDescription getDescription() {
    return description;
  }

  public ITextualDescription getLimitBreak() {
    return limitBreak;
  }

  @Override
  public boolean isFlawComplete() {
    return super.isFlawComplete() && !(limitBreak.isEmpty() || description.isEmpty());
  }
}