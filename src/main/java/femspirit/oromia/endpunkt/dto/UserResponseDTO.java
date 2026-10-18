package femspirit.oromia.endpunkt.dto;


public record UserResponseDTO(Long id, String username, String email, RoleResponseDTO role) {}