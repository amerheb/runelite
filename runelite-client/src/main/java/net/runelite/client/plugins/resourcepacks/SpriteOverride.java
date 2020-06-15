/*
 * Copyright (c) 2020, melky <https://github.com/melkypie>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client.plugins.resourcepacks;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import net.runelite.api.SpriteID;

@Getter
@RequiredArgsConstructor
enum SpriteOverride
{
	TAB_COMBAT(SpriteID.TAB_COMBAT, Folder.TAB),
	TAB_STATS(SpriteID.TAB_STATS, Folder.TAB),
	TAB_QUESTS(SpriteID.TAB_QUESTS, Folder.TAB),
	TAB_QUESTS_PURPLE_KOUREND(SpriteID.TAB_QUESTS_PURPLE_KOUREND, Folder.TAB),
	TAB_QUESTS_RED_MINIGAMES(SpriteID.TAB_QUESTS_RED_MINIGAMES, Folder.TAB),
	TAB_QUESTS_GREEN_ACHIEVEMENT_DIARIES(SpriteID.TAB_QUESTS_GREEN_ACHIEVEMENT_DIARIES, Folder.TAB),
	TAB_INVENTORY(SpriteID.TAB_INVENTORY, Folder.TAB),
	TAB_EQUIPMENT(SpriteID.TAB_EQUIPMENT, Folder.TAB),
	TAB_PRAYER(SpriteID.TAB_PRAYER, Folder.TAB),
	TAB_MAGIC(SpriteID.TAB_MAGIC, Folder.TAB),
	TAB_MAGIC_SPELLBOOK_ANCIENT_MAGICKS(SpriteID.TAB_MAGIC_SPELLBOOK_ANCIENT_MAGICKS, Folder.TAB),
	TAB_MAGIC_SPELLBOOK_LUNAR(SpriteID.TAB_MAGIC_SPELLBOOK_LUNAR, Folder.TAB),
	TAB_MAGIC_SPELLBOOK_ARCEUUS(SpriteID.TAB_MAGIC_SPELLBOOK_ARCEUUS, Folder.TAB),
	TAB_CLAN_CHAT(SpriteID.TAB_CLAN_CHAT, Folder.TAB),
	TAB_FRIENDS(SpriteID.TAB_FRIENDS, Folder.TAB),
	TAB_IGNORES(SpriteID.TAB_IGNORES, Folder.TAB),
	TAB_LOGOUT(SpriteID.TAB_LOGOUT, Folder.TAB),
	TAB_OPTIONS(SpriteID.TAB_OPTIONS, Folder.TAB),
	TAB_EMOTES(SpriteID.TAB_EMOTES, Folder.TAB),
	TAB_MUSIC(SpriteID.TAB_MUSIC, Folder.TAB),
	TAB_ACCOUNT_MANAGEMENT(1709, Folder.TAB),

	TAB_STONE_TOP_LEFT_SELECTED(SpriteID.TAB_STONE_TOP_LEFT_SELECTED, Folder.TAB),
	TAB_STONE_TOP_RIGHT_SELECTED(SpriteID.TAB_STONE_TOP_RIGHT_SELECTED, Folder.TAB),
	TAB_STONE_BOTTOM_LEFT_SELECTED(SpriteID.TAB_STONE_BOTTOM_LEFT_SELECTED, Folder.TAB),
	TAB_STONE_BOTTOM_RIGHT_SELECTED(SpriteID.TAB_STONE_BOTTOM_RIGHT_SELECTED, Folder.TAB),
	TAB_STONE_MIDDLE_SELECTED(SpriteID.TAB_STONE_MIDDLE_SELECTED, Folder.TAB),

	BUTTON_FRIENDS(SpriteID.BUTTON_FRIENDS, Folder.BUTTON),
	BUTTON_IGNORES(SpriteID.BUTTON_IGNORES, Folder.BUTTON),
	BUTTON_REGULAR_SMALL(1700, Folder.BUTTON),
	BUTTON_REGULAR_LARGE(1701, Folder.BUTTON),
	BUTTON_CORNER_TOP_LEFT(SpriteID.BUTTON_CORNER_TOP_LEFT, Folder.BUTTON),
	BUTTON_EDGE_TOP(SpriteID.BUTTON_EDGE_TOP, Folder.BUTTON),
	BUTTON_CORNER_TOP_RIGHT(SpriteID.BUTTON_CORNER_TOP_RIGHT, Folder.BUTTON),
	BUTTON_EDGE_LEFT(SpriteID.BUTTON_EDGE_LEFT, Folder.BUTTON),
	BUTTON_MIDDLE(SpriteID.BUTTON_MIDDLE, Folder.BUTTON),
	BUTTON_EDGE_RIGHT(SpriteID.BUTTON_EDGE_RIGHT, Folder.BUTTON),
	BUTTON_CORNER_BOTTOM_LEFT(SpriteID.BUTTON_CORNER_BOTTOM_LEFT, Folder.BUTTON),
	BUTTON_EDGE_BOTTOM(SpriteID.BUTTON_EDGE_BOTTOM, Folder.BUTTON),
	BUTTON_CORNER_BOTTOM_RIGHT(SpriteID.BUTTON_CORNER_BOTTOM_RIGHT, Folder.BUTTON),
	BUTTON_CORNER_TOP_LEFT_SELECTED(SpriteID.BUTTON_CORNER_TOP_LEFT_SELECTED, Folder.BUTTON),
	BUTTON_EDGE_TOP_SELECTED(SpriteID.BUTTON_EDGE_TOP_SELECTED, Folder.BUTTON),
	BUTTON_CORNER_TOP_RIGHT_SELECTED(SpriteID.BUTTON_CORNER_TOP_RIGHT_SELECTED, Folder.BUTTON),
	BUTTON_EDGE_LEFT_SELECTED(SpriteID.BUTTON_EDGE_LEFT_SELECTED, Folder.BUTTON),
	BUTTON_MIDDLE_SELECTED(SpriteID.BUTTON_MIDDLE_SELECTED, Folder.BUTTON),
	BUTTON_EDGE_RIGHT_SELECTED(SpriteID.BUTTON_EDGE_RIGHT_SELECTED, Folder.BUTTON),
	BUTTON_CORNER_BOTTOM_LEFT_SELECTED(SpriteID.BUTTON_CORNER_BOTTOM_LEFT_SELECTED, Folder.BUTTON),
	BUTTON_EDGE_BOTTOM_SELECTED(SpriteID.BUTTON_EDGE_BOTTOM_SELECTED, Folder.BUTTON),
	BUTTON_CORNER_BOTTOM_RIGHT_SELECTED(SpriteID.BUTTON_CORNER_BOTTOM_RIGHT_SELECTED, Folder.BUTTON),
	BUTTON_OPTIONS_SQUARE(SpriteID.OPTIONS_SQUARE_BUTTON, Folder.BUTTON),
	BUTTON_OPTIONS_SQUARE_SELECTED(SpriteID.OPTIONS_SQUARE_BUTTON_SELECTED, Folder.BUTTON),
	BUTTON_MUSIC_PLAYER(SpriteID.MUSIC_PLAYER_BUTTON, Folder.BUTTON),
	BUTTON_MUSIC_PLAYER_SELECTED(SpriteID.MUSIC_PLAYER_BUTTON_SELECTED, Folder.BUTTON),
	BUTTON_UNKNOWN_SQUARE_SMALL(SpriteID.UNKNOWN_BUTTON_SQUARE_SMALL, Folder.BUTTON),
	BUTTON_UNKNOWN_SQUARE_SMALL_SELECTED(SpriteID.UNKNOWN_BUTTON_SQUARE_SMALL_SELECTED, Folder.BUTTON),
	BUTTON_WORLD_SWITCHER_MIDDLE(SpriteID.UNKNOWN_BUTTON_MIDDLE, Folder.BUTTON),
	BUTTON_LOGOUT_MIDDLE(SpriteID.UNKNOWN_BUTTON_MIDDLE_SELECTED, Folder.BUTTON),
	BUTTON_COMBAT_STYLE_NARROW(SpriteID.COMBAT_STYLE_BUTTON_NARROW, Folder.BUTTON),
	BUTTON_COMBAT_STYLE_NARROW_SELECTED(SpriteID.COMBAT_STYLE_BUTTON_NARROW_SELECTED, Folder.BUTTON),
	BUTTON_COMBAT_STYLE_THIN(SpriteID.COMBAT_STYLE_BUTTON_THIN, Folder.BUTTON),
	BUTTON_COMBAT_STYLE_THIN_SELECTED(SpriteID.COMBAT_STYLE_BUTTON_THIN_SELECTED, Folder.BUTTON),
	BUTTON_BOTTOM_LINE_MODE_WINDOW_CLOSE_SMALL(SpriteID.BOTTOM_LINE_MODE_WINDOW_CLOSE_BUTTON_SMALL, Folder.BUTTON),
	BUTTON_BOTTOM_LINE_MODE_WINDOW_CLOSE_SMALL_HOVERED(SpriteID.BOTTOM_LINE_MODE_WINDOW_CLOSE_BUTTON_SMALL_HOVERED, Folder.BUTTON),
	BUTTON_TUTORIAL(2521, Folder.BUTTON),
	BUTTON_TUTORIAL_HOVERED(2522, Folder.BUTTON),
	BUTTON_SLAYER_REWARDS_AND_POLL_HISTORY(SpriteID.SLAYER_REWARDS_AND_POLL_HISTORY_BUTTON, Folder.BUTTON),
	BUTTON_SLAYER_REWARDS_AND_POLL_HISTORY_SELECTED(SpriteID.SLAYER_REWARDS_AND_POLL_HISTORY_BUTTON_SELECTED, Folder.BUTTON),

	SKILL_ATTACK(SpriteID.SKILL_ATTACK, Folder.SKILL),
	SKILL_STRENGTH(SpriteID.SKILL_STRENGTH, Folder.SKILL),
	SKILL_DEFENCE(SpriteID.SKILL_DEFENCE, Folder.SKILL),
	SKILL_RANGED(SpriteID.SKILL_RANGED, Folder.SKILL),
	SKILL_PRAYER(SpriteID.SKILL_PRAYER, Folder.SKILL),
	SKILL_MAGIC(SpriteID.SKILL_MAGIC, Folder.SKILL),
	SKILL_HITPOINTS(SpriteID.SKILL_HITPOINTS, Folder.SKILL),
	SKILL_AGILITY(SpriteID.SKILL_AGILITY, Folder.SKILL),
	SKILL_HERBLORE(SpriteID.SKILL_HERBLORE, Folder.SKILL),
	SKILL_THIEVING(SpriteID.SKILL_THIEVING, Folder.SKILL),
	SKILL_CRAFTING(SpriteID.SKILL_CRAFTING, Folder.SKILL),
	SKILL_FLETCHING(SpriteID.SKILL_FLETCHING, Folder.SKILL),
	SKILL_MINING(SpriteID.SKILL_MINING, Folder.SKILL),
	SKILL_SMITHING(SpriteID.SKILL_SMITHING, Folder.SKILL),
	SKILL_FISHING(SpriteID.SKILL_FISHING, Folder.SKILL),
	SKILL_COOKING(SpriteID.SKILL_COOKING, Folder.SKILL),
	SKILL_FIREMAKING(SpriteID.SKILL_FIREMAKING, Folder.SKILL),
	SKILL_WOODCUTTING(SpriteID.SKILL_WOODCUTTING, Folder.SKILL),
	SKILL_RUNECRAFT(SpriteID.SKILL_RUNECRAFT, Folder.SKILL),
	SKILL_SLAYER(SpriteID.SKILL_SLAYER, Folder.SKILL),
	SKILL_FARMING(SpriteID.SKILL_FARMING, Folder.SKILL),
	SKILL_HUNTER(SpriteID.SKILL_HUNTER, Folder.SKILL),
	SKILL_CONSTRUCTION(SpriteID.SKILL_CONSTRUCTION, Folder.SKILL),

	COMPASS(SpriteID.COMPASS_TEXTURE, Folder.OTHER),
	WINDOW_CLOSE_BUTTON(SpriteID.WINDOW_CLOSE_BUTTON, Folder.OTHER),
	WINDOW_CLOSE_BUTTON_HOVERED(SpriteID.WINDOW_CLOSE_BUTTON_HOVERED, Folder.OTHER),
	WINDOW_CLOSE_BUTTON_RED_X(SpriteID.WINDOW_CLOSE_BUTTON_RED_X, Folder.OTHER),
	WINDOW_CLOSE_BUTTON_RED_X_HOVERED(SpriteID.WINDOW_CLOSE_BUTTON_RED_X_HOVERED, Folder.OTHER),
	WINDOW_CLOSE_BUTTON_BROWN_X(SpriteID.WINDOW_CLOSE_BUTTON_BROWN_X, Folder.OTHER),
	WINDOW_CLOSE_BUTTON_BROWN_X_HOVERED(SpriteID.WINDOW_CLOSE_BUTTON_BROWN_X_HOVERED, Folder.OTHER),
	WINDOW_FRAME_EDGE_LEFT(SpriteID.RS2_WINDOW_FRAME_EDGE_LEFT, Folder.OTHER),

	MINIMAP_ORB_FRAME(SpriteID.MINIMAP_ORB_FRAME, Folder.OTHER),
	MINIMAP_ORB_FRAME_HOVERED(SpriteID.MINIMAP_ORB_FRAME_HOVERED, Folder.OTHER),
	MINIMAP_ORB_XP(SpriteID.MINIMAP_ORB_XP, Folder.OTHER),
	MINIMAP_ORB_XP_ACTIVATED(SpriteID.MINIMAP_ORB_XP_ACTIVATED, Folder.OTHER),
	MINIMAP_ORB_XP_HOVERED(SpriteID.MINIMAP_ORB_XP_HOVERED, Folder.OTHER),
	MINIMAP_ORB_XP_ACTIVATED_HOVERED(SpriteID.MINIMAP_ORB_XP_ACTIVATED_HOVERED, Folder.OTHER),
	MINIMAP_ORB_WORLD_MAP_FRAME(SpriteID.MINIMAP_ORB_WORLD_MAP_FRAME, Folder.OTHER),
	MINIMAP_ORB_WORLD_MAP_PLANET(SpriteID.MINIMAP_ORB_WORLD_MAP_PLANET, Folder.OTHER),
	MINIMAP_ORB_WORLD_MAP_PLANET_HOVERED(SpriteID.MINIMAP_ORB_WORLD_MAP_PLANET_HOVERED, Folder.OTHER),

	DIALOG_BACKGROUND(SpriteID.DIALOG_BACKGROUND, Folder.DIALOG),
	DIALOG_BACKGROUND_BRIGHTER(SpriteID.DIALOG_BACKGROUND_BRIGHTER, Folder.DIALOG),
	DIALOG_BOTTOM_LINE_MODE_SIDE_PANEL_EDGE_TOP(SpriteID.BOTTOM_LINE_MODE_SIDE_PANEL_EDGE_TOP, Folder.DIALOG),
	DIALOG_BOTTOM_LINE_MODE_SIDE_PANEL_EDGE_LEFT(SpriteID.BOTTOM_LINE_MODE_SIDE_PANEL_EDGE_LEFT, Folder.DIALOG),
	DIALOG_BOTTOM_LINE_MODE_SIDE_PANEL_EDGE_BOTTOM(SpriteID.BOTTOM_LINE_MODE_SIDE_PANEL_EDGE_BOTTOM, Folder.DIALOG),
	DIALOG_BOTTOM_LINE_MODE_SIDE_PANEL_EDGE_RIGHT(SpriteID.BOTTOM_LINE_MODE_SIDE_PANEL_EDGE_RIGHT, Folder.DIALOG),
	DIALOG_BOTTOM_LINE_MODE_SIDE_PANEL_CORNER_TOP_LEFT(SpriteID.BOTTOM_LINE_MODE_SIDE_PANEL_CORNER_TOP_LEFT, Folder.DIALOG),
	DIALOG_BOTTOM_LINE_MODE_SIDE_PANEL_CORNER_TOP_RIGHT(SpriteID.BOTTOM_LINE_MODE_SIDE_PANEL_CORNER_TOP_RIGHT, Folder.DIALOG),
	DIALOG_BOTTOM_LINE_MODE_SIDE_PANEL_CORNER_BOTTOM_LEFT(SpriteID.BOTTOM_LINE_MODE_SIDE_PANEL_CORNER_BOTTOM_LEFT, Folder.DIALOG),
	DIALOG_BOTTOM_LINE_MODE_SIDE_PANEL_CORNER_BOTTOM_RIGHT(SpriteID.BOTTOM_LINE_MODE_SIDE_PANEL_CORNER_BOTTOM_RIGHT, Folder.DIALOG),
	DIALOG_BOTTOM_LINE_MODE_SIDE_PANEL_EDGE_HORIZONTAL(SpriteID.BOTTOM_LINE_MODE_SIDE_PANEL_EDGE_HORIZONTAL, Folder.DIALOG),
	DIALOG_BOTTOM_LINE_MODE_SIDE_PANEL_INTERSECTION_LEFT(SpriteID.BOTTOM_LINE_MODE_SIDE_PANEL_INTERSECTION_LEFT, Folder.DIALOG),
	DIALOG_BOTTOM_LINE_MODE_SIDE_PANEL_INTERSECTION_RIGHT(SpriteID.BOTTOM_LINE_MODE_SIDE_PANEL_INTERSECTION_RIGHT, Folder.DIALOG),
	DIALOG_BOTTOM_LINE_MODE_SIDE_PANEL_INTERSECTION_TOP(SpriteID.BOTTOM_LINE_MODE_SIDE_PANEL_INTERSECTION_TOP, Folder.DIALOG),
	DIALOG_BOTTOM_LINE_MODE_SIDE_PANEL_INTERSECTION_BOTTOM(SpriteID.BOTTOM_LINE_MODE_SIDE_PANEL_INTERSECTION_BOTTOM, Folder.DIALOG),
	DIALOG_BOTTOM_LINE_MODE_EDGE_VERTICAL(SpriteID.BOTTOM_LINE_MODE_EDGE_VERTICAL, Folder.DIALOG),
	DIALOG_BOTTOM_LINE_MODE_INTERSECTION_TOP(SpriteID.BOTTOM_LINE_MODE_INTERSECTION_TOP, Folder.DIALOG),
	DIALOG_BOTTOM_LINE_MODE_INTERSECTION_BOTTOM(SpriteID.BOTTOM_LINE_MODE_INTERSECTION_BOTTOM, Folder.DIALOG),
	DIALOG_BOTTOM_LINE_MODE_CORNER_TOP_LEFT(SpriteID.BOTTOM_LINE_MODE_CORNER_TOP_LEFT, Folder.DIALOG),
	DIALOG_BOTTOM_LINE_MODE_CORNER_TOP_RIGHT(SpriteID.BOTTOM_LINE_MODE_CORNER_TOP_RIGHT, Folder.DIALOG),
	DIALOG_BOTTOM_LINE_MODE_CORNER_BOTTOM_LEFT(SpriteID.BOTTOM_LINE_MODE_CORNER_BOTTOM_LEFT, Folder.DIALOG),
	DIALOG_BOTTOM_LINE_MODE_CORNER_BOTTOM_RIGHT(SpriteID.BOTTOM_LINE_MODE_CORNER_BOTTOM_RIGHT, Folder.DIALOG),
	DIALOG_IRON_RIVETS_VERTICAL(SpriteID.IRON_RIVETS_VERTICAL, Folder.DIALOG),
	DIALOG_IRON_RIVETS_HORIZONTAL(SpriteID.IRON_RIVETS_HORIZONTAL, Folder.DIALOG),
	DIALOG_IRON_RIVETS_CORNER_TOP_LEFT(SpriteID.IRON_RIVETS_CORNER_TOP_LEFT, Folder.DIALOG),
	DIALOG_IRON_RIVETS_CORNER_TOP_RIGHT(SpriteID.IRON_RIVETS_CORNER_TOP_RIGHT, Folder.DIALOG),
	DIALOG_IRON_RIVETS_CORNER_BOTTOM_LEFT(SpriteID.IRON_RIVETS_CORNER_BOTTOM_LEFT, Folder.DIALOG),
	DIALOG_IRON_RIVETS_CORNER_BOTTOM_RIGHT(SpriteID.IRON_RIVETS_CORNER_BOTTOM_RIGHT, Folder.DIALOG),
	DIALOG_IRON_RIVETS_EDGE_TOP(SpriteID.IRON_RIVETS_EDGE_TOP, Folder.DIALOG),
	DIALOG_IRON_RIVETS_EDGE_RIGHT(SpriteID.IRON_RIVETS_EDGE_RIGHT, Folder.DIALOG),

	BANK_TAB(SpriteID.BANK_TAB, Folder.BANK),
	BANK_TAB_HOVERED(SpriteID.BANK_TAB_HOVERED, Folder.BANK),
	BANK_TAB_SELECTED(SpriteID.BANK_TAB_SELECTED, Folder.BANK),
	BANK_TAB_EMPTY(SpriteID.BANK_TAB_EMPTY, Folder.BANK),
	BANK_TAB_ADD_ICON(SpriteID.BANK_ADD_TAB_ICON, Folder.BANK),
	BANK_TAB_ALL_ITEMS_ICON(SpriteID.BANK_ALL_ITEMS_TAB_ICON, Folder.BANK),
	BANK_TAG_TAB(-201, Folder.BANK),
	BANK_TAG_TAB_ACTIVE(-202, Folder.BANK),
	BANK_TAG_UP_ARROW(-203, Folder.BANK),
	BANK_TAG_DOWN_ARROW(-204, Folder.BANK),
	BANK_TAG_NEW_TAB(-205, Folder.BANK),

	OLD_SCHOOl_MODE_SIDE_PANEL_EDGE_LEFT_UPPER(SpriteID.OLD_SCHOOl_MODE_SIDE_PANEL_EDGE_LEFT_UPPER, Folder.OTHER),
	OLD_SCHOOl_MODE_SIDE_PANEL_EDGE_LEFT_LOWER(SpriteID.OLD_SCHOOl_MODE_SIDE_PANEL_EDGE_LEFT_LOWER, Folder.OTHER),
	OLD_SCHOOl_MODE_SIDE_PANEL_EDGE_RIGHT(SpriteID.OLD_SCHOOl_MODE_SIDE_PANEL_EDGE_RIGHT, Folder.OTHER),

	WIKI_DESELECTED(SpriteID.WIKI_DESELECTED, Folder.OTHER),
	WIKI_SELECTED(SpriteID.WIKI_SELECTED, Folder.OTHER),

	CHATBOX_BACKGROUND(SpriteID.CHATBOX, Folder.CHATBOX),
	CHATBOX_BUTTONS_BACKGROUND_STONES(SpriteID.CHATBOX_BUTTONS_BACKGROUND_STONES, Folder.CHATBOX),
	CHATBOX_BUTTON(SpriteID.CHATBOX_BUTTON, Folder.CHATBOX),
	CHATBOX_BUTTON_HOVERED(SpriteID.CHATBOX_BUTTON_HOVERED, Folder.CHATBOX),
	CHATBOX_BUTTON_NEW_MESSAGES(SpriteID.CHATBOX_BUTTON_NEW_MESSAGES, Folder.CHATBOX),
	CHATBOX_BUTTON_SELECTED(SpriteID.CHATBOX_BUTTON_SELECTED, Folder.CHATBOX),
	CHATBOX_BUTTON_SELECTED_HOVERED(SpriteID.CHATBOX_BUTTON_SELECTED_HOVERED, Folder.CHATBOX),
	CHATBOX_REPORT_BUTTON(SpriteID.CHATBOX_REPORT_BUTTON, Folder.CHATBOX),
	CHATBOX_REPORT_BUTTON_HOVERED(SpriteID.CHATBOX_REPORT_BUTTON_HOVERED, Folder.CHATBOX),

	SCROLLBAR_ARROW_UP(SpriteID.SCROLLBAR_ARROW_UP, Folder.SCROLLBAR),
	SCROLLBAR_ARROW_DOWN(SpriteID.SCROLLBAR_ARROW_DOWN, Folder.SCROLLBAR),
	SCROLLBAR_THUMB_TOP(SpriteID.SCROLLBAR_THUMB_TOP, Folder.SCROLLBAR),
	SCROLLBAR_THUMB_MIDDLE(SpriteID.SCROLLBAR_THUMB_MIDDLE, Folder.SCROLLBAR),
	SCROLLBAR_THUMB_BOTTOM(SpriteID.SCROLLBAR_THUMB_BOTTOM, Folder.SCROLLBAR),
	SCROLLBAR_THUMB_MIDDLE_DARK(SpriteID.SCROLLBAR_THUMB_MIDDLE_DARK, Folder.SCROLLBAR),

	FIXED_MODE_SIDE_PANEL_BACKGROUND(SpriteID.FIXED_MODE_SIDE_PANEL_BACKGROUND, Folder.FIXED_MODE),
	FIXED_MODE_TABS_ROW_BOTTOM(SpriteID.FIXED_MODE_TABS_ROW_BOTTOM, Folder.FIXED_MODE),
	FIXED_MODE_TABS_TOP_ROW(SpriteID.FIXED_MODE_TABS_TOP_ROW, Folder.FIXED_MODE),
	FIXED_MODE_MINIMAP_LEFT_EDGE(SpriteID.FIXED_MODE_MINIMAP_LEFT_EDGE, Folder.FIXED_MODE),
	FIXED_MODE_MINIMAP_RIGHT_EDGE(SpriteID.FIXED_MODE_MINIMAP_RIGHT_EDGE, Folder.FIXED_MODE),
	FIXED_MODE_WINDOW_FRAME_EDGE_TOP(SpriteID.FIXED_MODE_WINDOW_FRAME_EDGE_TOP, Folder.FIXED_MODE),
	FIXED_MODE_MINIMAP_AND_COMPASS_FRAME(SpriteID.FIXED_MODE_MINIMAP_AND_COMPASS_FRAME, Folder.FIXED_MODE),
	FIXED_MODE_MINIMAP_FRAME_BOTTOM(SpriteID.FIXED_MODE_MINIMAP_FRAME_BOTTOM, Folder.FIXED_MODE),
	FIXED_MODE_TOP_RIGHT_CORNER(SpriteID.FIXED_MODE_TOP_RIGHT_CORNER, Folder.FIXED_MODE),

	RESIZEABLE_MODE_SIDE_PANEL_BACKGROUND(SpriteID.RESIZEABLE_MODE_SIDE_PANEL_BACKGROUND, Folder.RESIZEABLE_MODE),
	RESIZEABLE_MODE_TABS_TOP_ROW(SpriteID.RESIZEABLE_MODE_TABS_TOP_ROW, Folder.RESIZEABLE_MODE),
	RESIZEABLE_MODE_TABS_BOTTOM_ROW(SpriteID.RESIZEABLE_MODE_TABS_BOTTOM_ROW, Folder.RESIZEABLE_MODE),
	RESIZEABLE_MODE_SIDE_PANEL_EDGE_LEFT(SpriteID.RESIZEABLE_MODE_SIDE_PANEL_EDGE_LEFT, Folder.RESIZEABLE_MODE),
	RESIZEABLE_MODE_SIDE_PANEL_EDGE_RIGHT(SpriteID.RESIZEABLE_MODE_SIDE_PANEL_EDGE_RIGHT, Folder.RESIZEABLE_MODE),
	RESIZEABLE_MODE_MINIMAP_AND_COMPASS_FRAME(SpriteID.RESIZEABLE_MODE_MINIMAP_AND_COMPASS_FRAME, Folder.RESIZEABLE_MODE),
	RESIZEABLE_MODE_TAB_STONE_MIDDLE(SpriteID.RESIZEABLE_MODE_TAB_STONE_MIDDLE, Folder.RESIZEABLE_MODE),
	RESIZEABLE_MODE_TAB_STONE_MIDDLE_SELECTED(SpriteID.RESIZEABLE_MODE_TAB_STONE_MIDDLE_SELECTED, Folder.RESIZEABLE_MODE),

	EQUIPMENT_SLOT_TILE(SpriteID.EQUIPMENT_SLOT_TILE, Folder.EQUIPMENT),
	EQUIPMENT_SLOT_SELECTED(SpriteID.EQUIPMENT_SLOT_SELECTED, Folder.EQUIPMENT),
	EQUIPMENT_SLOT_HEAD(SpriteID.EQUIPMENT_SLOT_HEAD, Folder.EQUIPMENT),
	EQUIPMENT_SLOT_CAPE(SpriteID.EQUIPMENT_SLOT_CAPE, Folder.EQUIPMENT),
	EQUIPMENT_SLOT_NECK(SpriteID.EQUIPMENT_SLOT_NECK, Folder.EQUIPMENT),
	EQUIPMENT_SLOT_WEAPON(SpriteID.EQUIPMENT_SLOT_WEAPON, Folder.EQUIPMENT),
	EQUIPMENT_SLOT_RING(SpriteID.EQUIPMENT_SLOT_RING, Folder.EQUIPMENT),
	EQUIPMENT_SLOT_TORSO(SpriteID.EQUIPMENT_SLOT_TORSO, Folder.EQUIPMENT),
	EQUIPMENT_SLOT_SHIELD(SpriteID.EQUIPMENT_SLOT_SHIELD, Folder.EQUIPMENT),
	EQUIPMENT_SLOT_LEGS(SpriteID.EQUIPMENT_SLOT_LEGS, Folder.EQUIPMENT),
	EQUIPMENT_SLOT_HANDS(SpriteID.EQUIPMENT_SLOT_HANDS, Folder.EQUIPMENT),
	EQUIPMENT_SLOT_FEET(SpriteID.EQUIPMENT_SLOT_FEET, Folder.EQUIPMENT),
	EQUIPMENT_SLOT_AMMUNITION(SpriteID.EQUIPMENT_SLOT_AMMUNITION, Folder.EQUIPMENT),

	STATS_TILE_HALF_LEFT(SpriteID.STATS_TILE_HALF_LEFT, Folder.STATS),
	STATS_TILE_HALF_RIGHT_WITH_SLASH(SpriteID.STATS_TILE_HALF_RIGHT_WITH_SLASH, Folder.STATS),
	STATS_TILE_HALF_RIGHT(SpriteID.STATS_TILE_HALF_RIGHT, Folder.STATS),
	STATS_TILE_HALF_LEFT_BLACK(SpriteID.STATS_TILE_HALF_LEFT_BLACK, Folder.STATS),
	STATS_TILE_HALF_RIGHT_BLACK(SpriteID.STATS_TILE_HALF_RIGHT_BLACK, Folder.STATS),
	STATS_TILE_HALF_LEFT_SELECTED(SpriteID.STATS_TILE_HALF_LEFT_SELECTED, Folder.STATS),
	STATS_TILE_HALF_RIGHT_SELECTED(SpriteID.STATS_TILE_HALF_RIGHT_SELECTED, Folder.STATS),
	STATS_TILE_HALF_RIGHT_WITH_SLASH_SELECTED(SpriteID.STATS_TILE_HALF_RIGHT_WITH_SLASH_SELECTED, Folder.STATS),

	OPTIONS_SLIDER_1_OF_4(SpriteID.OPTIONS_SLIDER_1_OF_4, Folder.OPTIONS),
	OPTIONS_SLIDER_2_OF_4(SpriteID.OPTIONS_SLIDER_2_OF_4, Folder.OPTIONS),
	OPTIONS_SLIDER_3_OF_4(SpriteID.OPTIONS_SLIDER_3_OF_4, Folder.OPTIONS),
	OPTIONS_SLIDER_4_OF_4(SpriteID.OPTIONS_SLIDER_4_OF_4, Folder.OPTIONS),
	OPTIONS_SLIDER_AND_THUMB_1_OF_4(SpriteID.OPTIONS_SLIDER_AND_THUMB_1_OF_4, Folder.OPTIONS),
	OPTIONS_SLIDER_AND_THUMB_2_OF_4(SpriteID.OPTIONS_SLIDER_AND_THUMB_2_OF_4, Folder.OPTIONS),
	OPTIONS_SLIDER_AND_THUMB_3_OF_4(SpriteID.OPTIONS_SLIDER_AND_THUMB_3_OF_4, Folder.OPTIONS),
	OPTIONS_SLIDER_AND_THUMB_4_OF_4(SpriteID.OPTIONS_SLIDER_AND_THUMB_4_OF_4, Folder.OPTIONS),
	OPTIONS_SLIDER_AND_THUMB_1_OF_5(SpriteID.OPTIONS_SLIDER_AND_THUMB_1_OF_5, Folder.OPTIONS),
	OPTIONS_SLIDER_AND_THUMB_2_OF_5(SpriteID.OPTIONS_SLIDER_AND_THUMB_2_OF_5, Folder.OPTIONS),
	OPTIONS_SLIDER_AND_THUMB_3_OF_5(SpriteID.OPTIONS_SLIDER_AND_THUMB_3_OF_5, Folder.OPTIONS),
	OPTIONS_SLIDER_AND_THUMB_4_OF_5(SpriteID.OPTIONS_SLIDER_AND_THUMB_4_OF_5, Folder.OPTIONS),
	OPTIONS_SLIDER_AND_THUMB_5_OF_5(SpriteID.OPTIONS_SLIDER_AND_THUMB_5_OF_5, Folder.OPTIONS),
	OPTIONS_SLIDER_1_OF_5(SpriteID.OPTIONS_SLIDER_1_OF_5, Folder.OPTIONS),
	OPTIONS_SLIDER_2_OF_5(SpriteID.OPTIONS_SLIDER_2_OF_5, Folder.OPTIONS),
	OPTIONS_SLIDER_3_OF_5(SpriteID.OPTIONS_SLIDER_3_OF_5, Folder.OPTIONS),
	OPTIONS_SLIDER_4_OF_5(SpriteID.OPTIONS_SLIDER_4_OF_5, Folder.OPTIONS),
	OPTIONS_SLIDER_5_OF_5(SpriteID.OPTIONS_SLIDER_5_OF_5, Folder.OPTIONS),
	OPTIONS_ZOOM_SLIDER_THUMB(SpriteID.OPTIONS_ZOOM_SLIDER_THUMB, Folder.OPTIONS),
	OPTIONS_ROUND_CHECK_BOX(SpriteID.OPTIONS_ROUND_CHECK_BOX, Folder.OPTIONS),
	OPTIONS_ROUND_CHECK_BOX_CHECKED(SpriteID.OPTIONS_ROUND_CHECK_BOX_CHECKED, Folder.OPTIONS),
	OPTIONS_ROUND_CHECK_BOX_CROSSED(SpriteID.OPTIONS_ROUND_CHECK_BOX_CROSSED, Folder.OPTIONS),

	GE_BUTTON(SpriteID.GE_BUTTON, Folder.GE),
	GE_BUTTON_HOVERED(SpriteID.GE_BUTTON_HOVERED, Folder.GE),
	GE_DECREMENT_BUTTON(SpriteID.GE_DECREMENT_BUTTON, Folder.GE),
	GE_INCREMENT_BUTTON(SpriteID.GE_INCREMENT_BUTTON, Folder.GE),
	GE_SELECTED_ITEM_BOX(SpriteID.GE_SELECTED_ITEM_BOX, Folder.GE),
	GE_SELECTED_ITEM_BOX_GLOWING(SpriteID.GE_SELECTED_ITEM_BOX_GLOWING, Folder.GE),
	GE_NUMBER_FIELD_EDGE_LEFT(SpriteID.GE_NUMBER_FIELD_EDGE_LEFT, Folder.GE),
	GE_NUMBER_FIELD_MIDDLE(SpriteID.GE_NUMBER_FIELD_MIDDLE, Folder.GE),
	GE_NUMBER_FIELD_EDGE_RIGHT(SpriteID.GE_NUMBER_FIELD_EDGE_RIGHT, Folder.GE),
	GE_BORDER_OFFER_TOP(SpriteID.UNKNOWN_BORDER_EDGE_HORIZONTAL, Folder.GE),
	GE_BORDER_OFFER_LEFT(SpriteID.UNKNOWN_BORDER_EDGE_VERTICAL, Folder.GE),
	GE_BORDER_OFFER_BOTTOM(SpriteID.UNKNOWN_BORDER_EDGE_HORIZONTAL_989, Folder.GE),
	GE_BORDER_OFFER_RIGHT(SpriteID.UNKNOWN_BORDER_EDGE_VERTICAL_990, Folder.GE),
	GE_BORDER_OFFER_CORNER_TOP_LEFT(SpriteID.UNKNOWN_BORDER_CORNER_TOP_LEFT, Folder.GE),
	GE_BORDER_OFFER_CORNER_TOP_RIGHT(SpriteID.UNKNOWN_BORDER_CORNER_TOP_RIGHT, Folder.GE),
	GE_BORDER_OFFER_CORNER_BOTTOM_LEFT(SpriteID.UNKNOWN_BORDER_CORNER_BOTTOM_LEFT, Folder.GE),
	GE_BORDER_OFFER_CORNER_BOTTOM_RIGHT(SpriteID.UNKNOWN_BORDER_CORNER_BOTTOM_RIGHT, Folder.GE),
	GE_BORDER_OFFER_HORIZONTAL(SpriteID.UNKNOWN_BORDER_EDGE_HORIZONTAL_995, Folder.GE),
	GE_BORDER_OFFER_INTERSECTION_LEFT(SpriteID.UNKNOWN_BORDER_INTERSECTION_LEFT, Folder.GE),
	GE_BORDER_OFFER_INTERSECTION_RIGHT(SpriteID.UNKNOWN_BORDER_INTERSECTION_RIGHT, Folder.GE),
	;

	private final int spriteID;
	private final Folder folder;


	enum Folder
	{
		BUTTON,
		CHATBOX,
		FIXED_MODE,
		RESIZEABLE_MODE,
		SCROLLBAR,
		SKILL,
		TAB,
		OTHER,
		BANK,
		DIALOG,
		EQUIPMENT,
		STATS,
		OPTIONS,
		GE,
	}
}