package com.oficial.plannerOficial.activity;

import java.time.LocalDateTime;

public record ActivityData(Long id, String title, LocalDateTime occurs_at) {
}
