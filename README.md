# AGP Validation Test Repository 2

Test repository for verifying GUIDE-3140: AGP global validation commands in monorepos.

## Structure

- `module-a/` - First Maven module with Apache Commons Lang
  - Contains actual Java source code
  - Uses commons-lang3 3.12.0 (has security updates)

- `module-b/` - Second Maven module with Jackson
  - Contains actual Java source code  
  - Uses jackson-databind 2.13.0 (has security vulnerabilities)

## Purpose

Verify that global validation commands configured in Guide UI apply to ALL projects in a monorepo after GUIDE-3140 fix.
