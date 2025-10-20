package com.atp.fwfe.controller.work;

import com.atp.fwfe.dto.work.CompanyResponse;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
import com.atp.fwfe.dto.work.CreateCompanyDto;
=======
>>>>>>> be9c2d22b390b8389679befff364e08bdff42788
=======
>>>>>>> be9c2d22b390b8389679befff364e08bdff42788
=======
import com.atp.fwfe.dto.work.CreateCompanyDto;
>>>>>>> dd9e548b27a8559239cd2901f94860b9b455b161
import com.atp.fwfe.service.work.CompanyService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
import org.springframework.security.core.context.SecurityContextHolder;
=======
>>>>>>> be9c2d22b390b8389679befff364e08bdff42788
=======
>>>>>>> be9c2d22b390b8389679befff364e08bdff42788
=======
import org.springframework.security.core.context.SecurityContextHolder;
>>>>>>> dd9e548b27a8559239cd2901f94860b9b455b161
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/companies")
@CrossOrigin(origins = {
        "http://10.0.2.2:8000",
        "http://127.0.0.1:8000"
}, allowCredentials = "true")
@RequiredArgsConstructor
public class CompanyController {
    private final CompanyService companyService;

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> dd9e548b27a8559239cd2901f94860b9b455b161
    private String getCurrentUsername() {
        return SecurityContextHolder.getContext().getAuthentication().getName();
    }

<<<<<<< HEAD
    @PostMapping
    @PreAuthorize("hasAnyRole('ROLE_ADMIN','ROLE_MANAGER')")
    public ResponseEntity<CompanyResponse> create(
            @RequestBody @Valid CreateCompanyDto dto) {
        return ResponseEntity.ok(companyService.create(dto, getCurrentUsername()));
=======
=======
>>>>>>> be9c2d22b390b8389679befff364e08bdff42788
    @PostMapping
    @PreAuthorize("hasAnyRole('ROLE_ADMIN','ROLE_MANAGER')")
    public ResponseEntity<CompanyResponse> create(
            @RequestBody @Valid com.atp.fwfe.dto.work.CreateCompanyDto dto,
            @RequestHeader("X-Username") String username) {
        return ResponseEntity.ok(companyService.create(dto, username));
<<<<<<< HEAD
>>>>>>> be9c2d22b390b8389679befff364e08bdff42788
=======
>>>>>>> be9c2d22b390b8389679befff364e08bdff42788
=======
    @PostMapping
    @PreAuthorize("hasAnyRole('ROLE_ADMIN','ROLE_MANAGER')")
    public ResponseEntity<CompanyResponse> create(
            @RequestBody @Valid CreateCompanyDto dto) {
        return ResponseEntity.ok(companyService.create(dto, getCurrentUsername()));
>>>>>>> dd9e548b27a8559239cd2901f94860b9b455b161
    }

    @GetMapping("/my")
    @PreAuthorize("hasAnyRole('ROLE_ADMIN','ROLE_MANAGER')")
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
    public ResponseEntity<List<CompanyResponse>> getByOwner() {
        return ResponseEntity.ok(companyService.findByOwner(getCurrentUsername()));
=======
    public ResponseEntity<List<CompanyResponse>> getByOwner(
            @RequestHeader("X-Username") String username) {
        return ResponseEntity.ok(companyService.findByOwner(username));
>>>>>>> be9c2d22b390b8389679befff364e08bdff42788
=======
    public ResponseEntity<List<CompanyResponse>> getByOwner(
            @RequestHeader("X-Username") String username) {
        return ResponseEntity.ok(companyService.findByOwner(username));
>>>>>>> be9c2d22b390b8389679befff364e08bdff42788
=======
    public ResponseEntity<List<CompanyResponse>> getByOwner() {
        return ResponseEntity.ok(companyService.findByOwner(getCurrentUsername()));
>>>>>>> dd9e548b27a8559239cd2901f94860b9b455b161
    }

    @GetMapping("/{id}/public")
    @PreAuthorize("hasAnyRole('ROLE_ADMIN','ROLE_MANAGER','ROLE_USER')")
    public ResponseEntity<CompanyResponse> getPublicInfo(@PathVariable Long id) {
        return ResponseEntity.ok(companyService.getSanitizedCompany(id));
    }

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
    @GetMapping
    @PreAuthorize("hasAnyRole('ROLE_ADMIN','ROLE_MANAGER','ROLE_USER')")
    public ResponseEntity<List<CompanyResponse>> getAll() {
        String username = getCurrentUsername();
        String role = SecurityContextHolder.getContext().getAuthentication().getAuthorities().iterator().next().getAuthority();
=======
=======
>>>>>>> be9c2d22b390b8389679befff364e08bdff42788

    @GetMapping
    @PreAuthorize("hasAnyRole('ROLE_ADMIN','ROLE_MANAGER','ROLE_USER')")
    public ResponseEntity<List<CompanyResponse>> getAll(
            @RequestHeader("X-Username") String username,
            @RequestHeader("X-Role") String role) {
<<<<<<< HEAD
>>>>>>> be9c2d22b390b8389679befff364e08bdff42788
=======
>>>>>>> be9c2d22b390b8389679befff364e08bdff42788
=======
    @GetMapping
    @PreAuthorize("hasAnyRole('ROLE_ADMIN','ROLE_MANAGER','ROLE_USER')")
    public ResponseEntity<List<CompanyResponse>> getAll() {
        String username = getCurrentUsername();
        String role = SecurityContextHolder.getContext().getAuthentication().getAuthorities().iterator().next().getAuthority();
>>>>>>> dd9e548b27a8559239cd2901f94860b9b455b161
        return ResponseEntity.ok(companyService.getAll(username, role));
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasAnyRole('ROLE_ADMIN','ROLE_MANAGER','ROLE_USER')")
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
    public ResponseEntity<CompanyResponse> getOne(@PathVariable Long id) {
        String username = getCurrentUsername();
        String role = SecurityContextHolder.getContext().getAuthentication().getAuthorities().iterator().next().getAuthority();
=======
=======
>>>>>>> be9c2d22b390b8389679befff364e08bdff42788
    public ResponseEntity<CompanyResponse> getOne(
            @PathVariable Long id,
            @RequestHeader("X-Username") String username,
            @RequestHeader("X-Role") String role) {
<<<<<<< HEAD
>>>>>>> be9c2d22b390b8389679befff364e08bdff42788
=======
>>>>>>> be9c2d22b390b8389679befff364e08bdff42788
=======
    public ResponseEntity<CompanyResponse> getOne(@PathVariable Long id) {
        String username = getCurrentUsername();
        String role = SecurityContextHolder.getContext().getAuthentication().getAuthorities().iterator().next().getAuthority();
>>>>>>> dd9e548b27a8559239cd2901f94860b9b455b161
        return ResponseEntity.ok(companyService.getOne(id, username, role));
    }

    @PutMapping("/{id}")
    @PreAuthorize("hasAnyRole('ROLE_ADMIN','ROLE_MANAGER')")
    public ResponseEntity<CompanyResponse> update(
            @PathVariable Long id,
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
            @RequestBody @Valid CreateCompanyDto dto) {
        String username = getCurrentUsername();
        String role = SecurityContextHolder.getContext().getAuthentication().getAuthorities().iterator().next().getAuthority();
=======
            @RequestBody @Valid com.atp.fwfe.dto.work.CreateCompanyDto dto,
            @RequestHeader("X-Username") String username,
            @RequestHeader("X-Role") String role) {
>>>>>>> be9c2d22b390b8389679befff364e08bdff42788
=======
            @RequestBody @Valid com.atp.fwfe.dto.work.CreateCompanyDto dto,
            @RequestHeader("X-Username") String username,
            @RequestHeader("X-Role") String role) {
>>>>>>> be9c2d22b390b8389679befff364e08bdff42788
=======
            @RequestBody @Valid CreateCompanyDto dto) {
        String username = getCurrentUsername();
        String role = SecurityContextHolder.getContext().getAuthentication().getAuthorities().iterator().next().getAuthority();
>>>>>>> dd9e548b27a8559239cd2901f94860b9b455b161
        return ResponseEntity.ok(companyService.update(id, dto, username, role));
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAnyRole('ROLE_ADMIN','ROLE_MANAGER')")
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        String username = getCurrentUsername();
        String role = SecurityContextHolder.getContext().getAuthentication().getAuthorities().iterator().next().getAuthority();
=======
=======
>>>>>>> be9c2d22b390b8389679befff364e08bdff42788
    public ResponseEntity<Void> delete(
            @PathVariable Long id,
            @RequestHeader("X-Username") String username,
            @RequestHeader("X-Role") String role) {
<<<<<<< HEAD
>>>>>>> be9c2d22b390b8389679befff364e08bdff42788
=======
>>>>>>> be9c2d22b390b8389679befff364e08bdff42788
=======
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        String username = getCurrentUsername();
        String role = SecurityContextHolder.getContext().getAuthentication().getAuthorities().iterator().next().getAuthority();
>>>>>>> dd9e548b27a8559239cd2901f94860b9b455b161
        companyService.delete(id, username, role);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/search")
    @PreAuthorize("hasAnyRole('ROLE_ADMIN','ROLE_MANAGER','ROLE_USER')")
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
    public ResponseEntity<List<CompanyResponse>> search(@RequestParam String keyword) {
        return ResponseEntity.ok(companyService.search(keyword));
    }
}
=======
=======
>>>>>>> be9c2d22b390b8389679befff364e08bdff42788
    public ResponseEntity<List<CompanyResponse>> search(
            @RequestParam String keyword) {
        return ResponseEntity.ok(companyService.search(keyword));
    }
}

<<<<<<< HEAD
>>>>>>> be9c2d22b390b8389679befff364e08bdff42788
=======
>>>>>>> be9c2d22b390b8389679befff364e08bdff42788
=======
    public ResponseEntity<List<CompanyResponse>> search(@RequestParam String keyword) {
        return ResponseEntity.ok(companyService.search(keyword));
    }
}
>>>>>>> dd9e548b27a8559239cd2901f94860b9b455b161
