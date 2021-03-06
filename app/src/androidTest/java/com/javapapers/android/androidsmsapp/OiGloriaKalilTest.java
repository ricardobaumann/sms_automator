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



    @Override
    protected String getOptoutKeyword() {
        return "SAIR";
    }

    @Override
    protected String getFirstContent() {
        return null;
    }

    @Override
    protected String getSignoutMessage() {
        return "GLORIA: Seu cancelamento foi efetuado com sucesso. Voce pode " +
                "assinar novamente a qualquer momento enviando ESTILO para " +
                "66006";
    }

    @Override
    protected String getAlreadySignedMessage() {
        return "GLORIA: Voce ja e assinante e recebera diariamente dicas para" +
                " voce ficar por dentro da moda. Duvidas? Envie AJUDA";
    }

    @Override
    protected String getWelcomeMessage() {
        return "Aproveite! Voce assinou o Estilo com Gloria Kalil e os 7 primeiros " +
                "dias sao GRATIS! Não";
    }

    @Override
    protected String getFreePeriodMessage() {
        return "Estilo com Gloria Kalil assinado! (RS3,99 por semana)." +
                " Voce recebera dicas diarias para voce ficar por dentro da moda. " +
                "Para cancelar envie SAIR para 66006";
    }

    @Override
    protected String getOptinKeyword() {
        return "ESTILO";
    }

    @Override
    protected String getLA() {
        return "66006";
    }
}
