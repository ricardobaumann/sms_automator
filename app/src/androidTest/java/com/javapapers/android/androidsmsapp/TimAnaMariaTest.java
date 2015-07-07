package com.javapapers.android.androidsmsapp;

/**
 * Created by ricardo on 07/07/15.
 */
public class TimAnaMariaTest extends SmsTest{

    @Override
    protected String getFirstContent() {
        return null;
    }

    @Override
    protected String getSignoutMessage() {
        return "Seu cancelamento foi realizado com sucesso";
    }

    @Override
    protected String getAlreadySignedMessage() {
        return null;
    }

    @Override
    protected String getWelcomeMessage() {
        return "TIM Ana Maria Braga: tudo sobre minha vida em www.timanamariabraga.com.br! " +
                "Apos 3 dias gratis: 3,99/semana. Cancelar? Envie SAIR. Protocolo:";
    }

    @Override
    protected String getFreePeriodMessage() {
        return "Bem vindo! Eu sou a ANA MARIA BRAGA e vou te contar as " +
                "minhas dicas para deixar seu astral la em cima! E mais: os " +
                "primeiros 3 dias sao GRATIS!";
    }

    @Override
    protected String getOptinKeyword() {
        return "AM";
    }

    @Override
    protected String getLA() {
        return "6078";
    }
}
