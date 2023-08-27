package me.sixteen_.sort.api;

import net.minecraft.item.Item;
import net.minecraft.screen.slot.Slot;

@FunctionalInterface
public interface IOrder {

	/**
	 * @return order by integer from low to high
	 */
	int getOrder(Slot slot);

	/**
	 * @return order by item id
	 */
	static int defaultOrder(Slot slot) {
		// since the list is sorted from low to high, the empty slot always
		// gets assigned the highest possible value
		return slot.getStack().isEmpty() ? Integer.MAX_VALUE : Item.getRawId(slot.getStack().getItem());
	}
}