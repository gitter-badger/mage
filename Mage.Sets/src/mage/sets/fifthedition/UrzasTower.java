/*
 *  Copyright 2010 BetaSteward_at_googlemail.com. All rights reserved.
 *
 *  Redistribution and use in source and binary forms, with or without modification, are
 *  permitted provided that the following conditions are met:
 *
 *     1. Redistributions of source code must retain the above copyright notice, this list of
 *        conditions and the following disclaimer.
 *
 *     2. Redistributions in binary form must reproduce the above copyright notice, this list
 *        of conditions and the following disclaimer in the documentation and/or other materials
 *        provided with the distribution.
 *
 *  THIS SOFTWARE IS PROVIDED BY BetaSteward_at_googlemail.com ``AS IS'' AND ANY EXPRESS OR IMPLIED
 *  WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
 *  FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL BetaSteward_at_googlemail.com OR
 *  CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 *  CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 *  SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
 *  ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 *  NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
 *  ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 *  The views and conclusions contained in the software and documentation are those of the
 *  authors and should not be interpreted as representing official policies, either expressed
 *  or implied, of BetaSteward_at_googlemail.com.
 */
package mage.sets.fifthedition;

import java.util.UUID;
import mage.Mana;
import mage.abilities.Ability;
import mage.abilities.dynamicvalue.common.UrzaTerrainValue;
import mage.abilities.mana.DynamicManaAbility;
import mage.cards.CardImpl;
import mage.constants.CardType;
import mage.constants.Rarity;

/**
 *
 * @author Melkhior
 */
public class UrzasTower extends CardImpl {
    public UrzasTower(UUID ownerId) {
        super(ownerId, 449, "Urza's Tower", Rarity.COMMON, new CardType[]{CardType.LAND}, "");
        this.subtype.add("Urza's");
        this.subtype.add("Tower");
        this.expansionSetCode = "5ED";

        // {T}: Add {1} to your mana pool. If you control an Urza's Mine and an Urza's Power-Plant, add {3} to your mana pool instead.
        Ability urzaManaAbility = new DynamicManaAbility(Mana.ColorlessMana(1), new UrzaTerrainValue(3),
                "Add {1} to your mana pool. If you control an Urza's Mine and an Urza's Power-Plant, add {3} to your mana pool instead");
        this.addAbility(urzaManaAbility);
    }

    public UrzasTower(final UrzasTower card) {
        super(card);
    }

    @Override
    public UrzasTower copy() {
        return new UrzasTower(this);
    }
}
