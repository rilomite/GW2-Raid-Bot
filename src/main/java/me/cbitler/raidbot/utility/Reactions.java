package me.cbitler.raidbot.utility;

import me.cbitler.raidbot.RaidBot;
import net.dv8tion.jda.core.entities.Emote;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Reactions {
    /**
     * List of reactions representing classes
     */
    static String[] specs = {
            "Affliction", //402027668461191168
            "Arcane", //402027668213596171
            "ArmsWarrior", //402027670738698240
            "BearTank", //402027670528851969
            "Demonology", //402027670172467201
            "Destro", //402027670180724766
            "Discpriest", //402027669094531072
            "Elesham", //402027669581070346
            "Enhsham", // 402027670084255744
            "FireMage", //4020276701514956806
            "Frostmage", //402027670021472256
            "Furywarrior", //402027668804993035
            "Holypriest", //402027669073690625
            "Hunterbm", //402027669035679746
            "Huntermm", //402027669207646218
            "Huntersv", //402027669253914624
            "kitty", //402027670529114122
            "Moonkin", //402027670193569794
            "Pallyholy", //402027669358772224
            "Pallyprot", //402027669539127326
            "Pallyret", //402027669547384832
            "Protwarrior", //402027670780772352
            "Rdruid", //402027669585264640
            "Rogue", //402027669279211522
            "Rsham", //402027669400584205
            "Spriest", //402027669614755842
            "X_", //404116063169675275
    };

    static Emote[] reactions = {
            getEmoji("402027668461191168"), // Affliction
            getEmoji("402027668213596171"), // Arcane
            getEmoji("402027670738698240"), // ArmsWarrior
            getEmoji("402027670528851969"), // BearTank
            getEmoji("402027670172467201"), // Demonology
            getEmoji("402027670180724766"), // Destro
            getEmoji("402027669094531072"), // Discpriest
            getEmoji("402027669581070346"), // EleSham
            getEmoji("402027670084255744"), // EnhSham
            getEmoji("402027670151495680"), // Fire
            getEmoji("4020276700214722563"), // Frostmage
            getEmoji("402027668804993035"), // FuryWarrior
            getEmoji("402027669073690625"), // HolyPriest
            getEmoji("402027669035679746"), // HunterBM
            getEmoji("402027669207646218"), // HunterMM
            getEmoji("402027669253914624"), // HunterSV
            getEmoji("402027670529114122"), // Kitty
            getEmoji("402027670193569794"), // Moonkin
            getEmoji("402027669358772224"), // PallyHoly
            getEmoji("402027669539127326"), // PallyProt
            getEmoji("402027669547384832"), // PallyRet
            getEmoji("402027670780772352"), // ProtWarrior
            getEmoji("402027669585264640"), // Rdruid
            getEmoji("402027669279211522"), // Rogue
            getEmoji("402027669400584205"), // Rsham
            getEmoji("402027669614755842"), // Spriest
            getEmoji("404116063169675275") // X_
    };
    };

    /**
     * Get an emoji from it's emote ID via JDA
     * @param id The ID of the emoji
     * @return The emote object representing that emoji
     */
    private static Emote getEmoji(String id) {
        return RaidBot.getInstance().getJda().getEmoteById(id);
    }

    /**
     * Get the list of reaction names as a list
     * @return The list of reactions as a list
     */
    public static List<String> getSpecs() {
        return new ArrayList<>(Arrays.asList(specs));
    }

    /**
     * Get the list of emote objects
     * @return The emotes
     */
    public static List<Emote> getEmotes() {
        return new ArrayList<>(Arrays.asList(reactions));
    }


}
