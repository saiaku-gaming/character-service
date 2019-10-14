package com.valhallagame.characterserviceclient;

import com.fasterxml.jackson.databind.JsonNode;
import com.valhallagame.characterserviceclient.message.*;
import com.valhallagame.characterserviceclient.model.CharacterData;
import com.valhallagame.common.AbstractServiceClient;
import com.valhallagame.common.DefaultServicePortMappings;
import com.valhallagame.common.RestResponse;

import java.io.IOException;

@SuppressWarnings("WeakerAccess")
public class CharacterServiceClient extends AbstractServiceClient {

    private static CharacterServiceClient characterServiceClient;

    private CharacterServiceClient() {
        serviceServerUrl = "http://localhost:" + DefaultServicePortMappings.CHARACTER_SERVICE_PORT;
    }

    public static void init(String serviceServerUrl) {
        CharacterServiceClient client = get();
        client.serviceServerUrl = serviceServerUrl;
    }

    public static CharacterServiceClient get() {
        if (characterServiceClient == null) {
            characterServiceClient = new CharacterServiceClient();
        }
        return characterServiceClient;
    }

    public RestResponse<CharacterData> getCharacter(String characterName) throws IOException {
        return restCaller.postCall(serviceServerUrl + "/v1/character/get-character",
                new GetCharacterParameter(characterName), CharacterData.class);
    }

    public RestResponse<CharacterData> getOwnedCharacter(String username, String characterName)
            throws IOException {
        return restCaller.postCall(serviceServerUrl + "/v1/character/get-owned-character",
                new GetOwnedCharacterParameter(characterName, username), CharacterData.class);
    }

    public RestResponse<JsonNode> getAllCharacters(String username) throws IOException {
        return restCaller.postCall(serviceServerUrl + "/v1/character/get-all-characters",
                new GetAllCharactersParameter(username), JsonNode.class);
    }

    public RestResponse<CharacterData> createCharacter(String username, String characterName, String startingClass) throws IOException {
        CreateCharacterParameter characterAndOwner = new CreateCharacterParameter(characterName, username, startingClass);
        return restCaller.postCall(serviceServerUrl + "/v1/character/create-character", characterAndOwner,
                CharacterData.class);
    }

    public RestResponse<String> deleteCharacter(String username, String characterName) throws IOException {
        return restCaller.postCall(serviceServerUrl + "/v1/character/delete-character",
                new DeleteCharacterParameter(characterName, username), String.class);
    }

    public RestResponse<String> characterAvailable(String characterName) throws IOException {
        return restCaller.postCall(serviceServerUrl + "/v1/character/character-available",
                new CharacterAvailableParameter(characterName), String.class);
    }

    public RestResponse<String> selectCharacter(String username, String characterName) throws IOException {
        return restCaller.postCall(serviceServerUrl + "/v1/character/select-character",
                new SelectCharacterParameter(characterName, username), String.class);
    }

    public RestResponse<CharacterData> getSelectedCharacter(String username) throws IOException {
        return restCaller.postCall(serviceServerUrl + "/v1/character/get-selected-character",
                new GetSelectedCharacterParameter(username), CharacterData.class);
    }

    public RestResponse<CharacterData> equipItem(String username, EquippedItemParameter itemToEquip) throws IOException {
        EquipItemParameter input = new EquipItemParameter(username, itemToEquip);
        return restCaller.postCall(serviceServerUrl + "/v1/character/equip-item", input,
                CharacterData.class);
    }

    public RestResponse<CharacterData> unequipItem(String username, String itemSlot) throws IOException {
        UnequipItemParameter input = new UnequipItemParameter(username, itemSlot);
        return restCaller.postCall(serviceServerUrl + "/v1/character/unequip-item", input,
                CharacterData.class);
    }

    public RestResponse<CharacterData> createDebugCharacter(String username, String characterName) throws IOException {
        CreateDebugCharacterParameter input = new CreateDebugCharacterParameter(characterName, username);
        return restCaller.postCall(serviceServerUrl + "/v1/character/create-debug-character",
                input, CharacterData.class);
    }
}
