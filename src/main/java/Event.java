package main.java;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.With;
import lombok.extern.jackson.Jacksonized;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.UUID;

@With
@AllArgsConstructor
@Jacksonized
@Builder
public class Event {

    private UUID uuid;
    private LocalDateTime sourceTime;
    private String payload;
    private Map<String, String> metadata;

}