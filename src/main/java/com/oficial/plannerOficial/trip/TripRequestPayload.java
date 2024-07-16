package com.oficial.plannerOficial.trip;

import java.util.List;

public record TripRequestPayload(String city, String state, String country, String starts_at, String ends_at, List<String> emails_to_invite, String owner_email, String owner_name) {
}