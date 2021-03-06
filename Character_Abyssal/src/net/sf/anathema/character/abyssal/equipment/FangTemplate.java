package net.sf.anathema.character.abyssal.equipment;

import net.sf.anathema.character.equipment.MagicalMaterial;
import net.sf.anathema.character.equipment.MaterialComposition;
import net.sf.anathema.character.equipment.impl.character.model.RegisteredNaturalWeapon;
import net.sf.anathema.character.equipment.template.IEquipmentTemplate;
import net.sf.anathema.character.generic.equipment.weapon.IEquipmentStats;
import net.sf.anathema.character.generic.rules.IExaltedRuleSet;
import net.sf.anathema.character.generic.rules.IRuleSetVisitor;

import static net.sf.anathema.character.generic.type.CharacterType.ABYSSAL;

@RegisteredNaturalWeapon(characterType = ABYSSAL)
public class FangTemplate implements IEquipmentTemplate {

  private static final SecondEditionFangStats SECOND_EDITION_FANG_STATS = new SecondEditionFangStats();
  private static final PowerCombatFangStats POWER_COMBAT_FANG_STATS = new PowerCombatFangStats();
  private static final CoreRulesFangStats CORE_RULES_FANG_STATS = new CoreRulesFangStats();
  private static final String FANG = "Abyssal.Fangs"; //$NON-NLS-1$

  public MaterialComposition getComposition() {
    return MaterialComposition.None;
  }

  public String getDescription() {
    return FANG;
  }

  public MagicalMaterial getMaterial() {
    return null;
  }

  public String getName() {
    return FANG;
  }

  public IEquipmentStats[] getStats(IExaltedRuleSet ruleSet) {
    final IEquipmentStats[] stats = new IEquipmentStats[1];
    ruleSet.accept(new IRuleSetVisitor() {
      public void visitCoreRules(IExaltedRuleSet set) {
        stats[0] = CORE_RULES_FANG_STATS;
      }

      public void visitPowerCombat(IExaltedRuleSet set) {
        stats[0] = POWER_COMBAT_FANG_STATS;
      }

      public void visitSecondEdition(IExaltedRuleSet set) {
        stats[0] = SECOND_EDITION_FANG_STATS;
      }
    });
    return stats;
  }
}