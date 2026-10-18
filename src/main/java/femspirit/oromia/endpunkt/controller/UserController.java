package femspirit.oromia.endpunkt.controller;



import femspirit.oromia.endpunkt.dto.RoleResponseDTO;
import femspirit.oromia.endpunkt.dto.UserResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @GetMapping("/user")
    public ResponseEntity<List<UserResponseDTO>> getUsers()
    {
        List<UserResponseDTO> result = List.of(
                new UserResponseDTO(1L, "oromia", "oromia@mail.de", new RoleResponseDTO(1L, "user")),
                new UserResponseDTO(2L, "gandalf", "gandalf@mail.de", new RoleResponseDTO(2L, "admin")),
                new UserResponseDTO(3L, "elrond", "elrond@mail.de", new RoleResponseDTO(3L, "member")),
                new UserResponseDTO(4L, "blade", "blade@mail.de", new RoleResponseDTO(3L, "member")),
                new UserResponseDTO(5L, "neo", "neo@mail.de", new RoleResponseDTO(3L, "member")),
                new UserResponseDTO(6L, "tylerdurden", "tylerdurden@mail.de", new RoleResponseDTO(3L, "member")),
                new UserResponseDTO(7L, "fantasticstorm", "fantasticstorm@mail.de", new RoleResponseDTO(3L, "member"))
        );

        return ResponseEntity.ok(result);
    }
}
