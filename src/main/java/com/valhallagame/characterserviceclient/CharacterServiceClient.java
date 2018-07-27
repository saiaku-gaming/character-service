package com.valhallagame.characterserviceclient;

import com.fasterxml.jackson.databind.JsonNode;
import com.valhallagame.characterserviceclient.message.*;
import com.valhallagame.characterserviceclient.model.CharacterData;
import com.valhallagame.common.DefaultServicePortMappings;
import com.valhallagame.common.RestCaller;
import com.valhallagame.common.RestResponse;

import java.io.IOException;
import java.util.List;

public class CharacterServiceClient {

	private static RestCaller restCaller = new RestCaller();

	private static CharacterServiceClient characterServiceClient;

	private String characterServiceServerUrl = "http://localhost:" + DefaultServicePortMappings.CHARACTER_SERVICE_PORT;

	private CharacterServiceClient() {
	}

	public static void init(String characterServiceServerUrl) {
		CharacterServiceClient client = get();
		client.characterServiceServerUrl = characterServiceServerUrl;
	}

	public static CharacterServiceClient get() {
		if (characterServiceClient == null) {
			characterServiceClient = new CharacterServiceClient();
		}
		return characterServiceClient;
	}

	public RestResponse<CharacterData> getCharacter(String characterName) throws IOException {
		return restCaller.postCall(characterServiceServerUrl + "/v1/character/get-character",
				new GetCharacterParameter(characterName), CharacterData.class);
	}

	public RestResponse<CharacterData> getOwnedCharacter(String username, String characterName)
			throws IOException {
		return restCaller.postCall(characterServiceServerUrl + "/v1/character/get-owned-character",
				new GetOwnedCharacterParameter(characterName, username), CharacterData.class);
	}

	public RestResponse<JsonNode> getAllCharacters(String username) throws IOException {
		return restCaller.postCall(characterServiceServerUrl + "/v1/character/get-all-characters",
				new GetAllCharactersParameter(username), JsonNode.class);
	}

    public RestResponse<String> createCharacter(String username, String characterName, String startingClass) throws IOException {
        CreateCharacterParameter characterAndOwner = new CreateCharacterParameter(characterName, username, startingClass);
		return restCaller.postCall(characterServiceServerUrl + "/v1/character/create-character", characterAndOwner,
				String.class);
	}

	public RestResponse<String> deleteCharacter(String username, String characterName) throws IOException {
		return restCaller.postCall(characterServiceServerUrl + "/v1/character/delete-character",
				new DeleteCharacterParameter(characterName, username), String.class);
	}

	public RestResponse<String> characterAvailable(String characterName) throws IOException {
		return restCaller.postCall(characterServiceServerUrl + "/v1/character/character-available",
				new CharacterAvailableParameter(characterName), String.class);
	}

	public RestResponse<String> selectCharacter(String username, String characterName) throws IOException {
		return restCaller.postCall(characterServiceServerUrl + "/v1/character/select-character",
				new SelectCharacterParameter(characterName, username), String.class);
	}

	public RestResponse<CharacterData> getSelectedCharacter(String username) throws IOException {
		return restCaller.postCall(characterServiceServerUrl + "/v1/character/get-selected-character",
				new GetSelectedCharacterParameter(username), CharacterData.class);
	}

	public RestResponse<CharacterData> saveEquippedItems(String username, String characterName, List<EquippedItemParameter> equippedItems) throws IOException {
		SaveEquippedItemsParameter input = new SaveEquippedItemsParameter(username, characterName, equippedItems);
		return restCaller.postCall(characterServiceServerUrl + "/v1/character/save-equipped-items", input,
				CharacterData.class);
	}

	public RestResponse<String> createDebugCharacter(String username, String characterName) throws IOException {
		CreateDebugCharacterParameter input = new CreateDebugCharacterParameter(characterName, username);
		return restCaller.postCall(characterServiceServerUrl + "/v1/character/create-debug-character",
				input, String.class);
	}
}
