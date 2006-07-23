package net.sf.anathema.character.equipment.impl.creation.model;

import net.sf.anathema.character.equipment.creation.model.IOffensiveStatisticsModel;
import net.sf.anathema.character.equipment.creation.model.IWeaponDamageModel;
import net.sf.anathema.lib.workflow.intvalue.IIntValueModel;
import net.sf.anathema.lib.workflow.intvalue.SimpleIntValueModel;
import net.sf.anathema.lib.workflow.textualdescription.ITextualDescription;
import net.sf.anathema.lib.workflow.textualdescription.model.SimpleTextualDescription;

public class OffensiveStatisticsModel implements IOffensiveStatisticsModel {

  private final ITextualDescription name = new SimpleTextualDescription();
  private final IIntValueModel speedModel = new SimpleIntValueModel(1);
  private final IIntValueModel accuracyModel = new SimpleIntValueModel(0);
  private final IIntValueModel rateModel = new SimpleIntValueModel(1);
  private final IWeaponDamageModel weaponDamageModel = new WeaponDamageModel();

  public ITextualDescription getName() {
    return name;
  }

  public IIntValueModel getSpeedModel() {
    return speedModel;
  }

  public IIntValueModel getAccuracyModel() {
    return accuracyModel;
  }

  public IIntValueModel getRateModel() {
    return rateModel;
  }

  public IWeaponDamageModel getWeaponDamageModel() {
    return weaponDamageModel;
  }
}