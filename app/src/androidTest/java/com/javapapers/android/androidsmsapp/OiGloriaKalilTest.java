package com.javapapers.android.androidsmsapp;

import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.collection.IsMapContaining.hasEntry;
import static org.hamcrest.core.Is.is;

/**
 * Created by ricardo on 03/07/15.
 */
public class OiGloriaKalilTest extends SmsTest {

    private static final String LA = "66006";

    private static final String KEYWORD_OPTIN = "ESTILO";

    private static final String KEYWORD_OPTOUT = "SAIR";

    public void testOptinOptout() {
        sendMessageAndDelay(LA, KEYWORD_OPTIN);

        verifyMessage(LA, "Estilo com Gloria Kalil assinado! (RS3,99 por semana)." +
                " Voce recebera dicas diarias para voce ficar por dentro da moda. " +
                "Para cancelar envie SAIR para 66006");

        verifyMessage(LA, "Aproveite! Voce assinou o Estilo com Gloria Kalil e os 7 primeiros " +
                "dias sao GRATIS! Não");

        sendMessageAndDelay(LA, KEYWORD_OPTIN);

        verifyMessage(LA, "GLORIA: Voce ja e assinante e recebera diariamente dicas para" +
                " voce ficar por dentro da moda. Duvidas? Envie AJUDA");

        sendMessageAndDelay(LA, KEYWORD_OPTOUT);

        verifyMessage(LA,"GLORIA: Seu cancelamento foi efetuado com sucesso. Voce pode " +
                "assinar novamente a qualquer momento enviando ESTILO para " +
                "66006");


    }

}
