package com.ajax.leetcode.devsu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinimumDistanceTest {
    @Test
    public void test() {
        int distance = MinimumDistance.minimumDistance("abcdefghi", "de");
        Assertions.assertEquals(3, distance);

        distance = MinimumDistance.minimumDistance("abcdefgci", "c");
        Assertions.assertEquals(1, distance);

        distance = MinimumDistance.minimumDistance("yfuajpocenamocibexujhalinesvlijlmylxmpexvfddpejowufvkbzkwlmxeoyartjholmpzxeuhquvmiuhgvasitvtgiexvunqhoeeowkpwbwwvipeptperrnljsomwcnrvpjmhfsjgixkopmxbgtlogplujljwxodbfczsxgondmgfhpicdroumealpplxkozuusmufmojyatfthxjlkdzewjfvjmijmkqppvhoedbhxnruuonntgstdbxchxyztnoqttgigyaxtyjlpfckefclzuylaskhgynmopqkbafsrnvifjuurmafusdqbziqpejdscfvyepevmfodjchakjndqcyvlleoxyadpzcmphchajrrbumoivxruwdliknfhgpdjfxreosblkjyjtrmjrqmfjheamkmckipseuzhvqcgyortoaheajxfiziunqgzizijoawrvjeyvcrmtpedrzkdukhzjjnaiejfxtkfpdpgdhsskfkfyusgfaefpodnprtcwtwfmjtyfwlsiqtgwnvluxkmvgmvshgikrteakgydwtbnhqfbtnynlwghstcpvufrvjxoehamfbvnjrrccwqgickbynzjzroyyiirnsdchfbivviqnbmhtercgvqolwzlixigoddxiukmitymvljojpwjjdmteegbqwgovnxanresklkiabrnlfumxtmuclccbkajcbrmmdzfdzzcftqiuaadcfrfocdpifyrasthgkmufkoyvlopavsjpmjystcuwtrqxsrymlmjbdapjmtcsberjknhyawbkeeimdmhtpuixkmllpqbjhqpzfybemsilpzzrlifxjxhskzengcldevyswdtxqkniuiffjqwdhjushlowheuotpfinwodqzfcjcypgqrtvpclogidofispdmgdjbscpouxckilknnqcjwydqzfbfnrwfahkmorcndxqwljefekdpafbsdoldbmkvizvtzko", "jfx");
        Assertions.assertEquals(391, distance);

        distance = MinimumDistance.minimumDistance("klrlycqponminlfqnruuzrnzzsclzdluagdybtblfkqnaojtdbicdhyxvrscolapenmcsvjdwetulayqhrvrqaukwtmhbbzjxmrkvrgbsfcuegfnqadqockturhgjxjkcdxrfsgpnylutuyinhucztqzksdiwklslkdefmqdohncyelpksekofyxzfvotbzjefhvkxor", "kasasdkydwg");
        Assertions.assertEquals(-1, distance);

        distance = MinimumDistance.minimumDistance("uepnzleaiogoxbvdcwalayckdzfzxdvddexcofcjlujrzofzolxmigtogtslkwwuxdilwmdjlpaqufnvuuufvhcmwpjqhlchtmqzrijwajbqzwrtzcmbwjvzfdhgunizgddehprykgvbpohccigzyvhintlpwotuvvlzrqicnavvnxfteduomtdjlwqyxbridegazizo", "egazizo");
        Assertions.assertEquals(0, distance);
    }
}
