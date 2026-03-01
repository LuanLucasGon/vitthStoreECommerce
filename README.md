# vitthStoreECommerce
Loja de roupa virtual

## Arquitetura do Projeto

O projeto utiliza uma Clean Architecture reduzida, organizada por funcionalidade. Cada módulo segue a mesma estrutura:

```
src/main/java/com/example/vitthstore/
└── {modulo}/
    ├── model/
    │   └── {Modulo}.java                        ← domínio puro, sem anotações de framework
    ├── entity/
    │   └── {Modulo}Entity.java                  ← mapeamento JPA (@Entity)
    ├── infrastructure/
    │   ├── {Modulo}Repository.java              ← Spring Data JPA
    │   ├── {Modulo}Api.java                     ← interface Swagger (@Tag, @Operation)
    │   ├── {Modulo}Controller.java              ← @RestController (implements {Modulo}Api)
    │   └── query/
    │       └── {Modulo}QueryRepository.java     ← queries JPQL/nativas personalizadas
    ├── usecase/
    │   ├── Create{Modulo}UseCase.java
    │   ├── Find{Modulo}UseCase.java
    │   ├── Update{Modulo}UseCase.java
    │   ├── Delete{Modulo}UseCase.java
    │   └── impl/
    │       ├── Create{Modulo}UseCaseImpl.java
    │       ├── Find{Modulo}UseCaseImpl.java
    │       ├── Update{Modulo}UseCaseImpl.java
    │       └── Delete{Modulo}UseCaseImpl.java
    └── dto/
        └── (DTOs de entrada e saída)
```

### Responsabilidades

| Camada | Descrição |
|---|---|
| `model/` | Objeto de domínio puro, sem dependências de framework |
| `entity/` | Mapeamento JPA da entidade para o banco de dados |
| `infrastructure/` | Tudo acoplado a framework: repositório Spring Data, controller REST e interface Swagger |
| `infrastructure/query/` | Interface para queries personalizadas estendida pelo repositório |
| `usecase/` | Interfaces de caso de uso com responsabilidade única por operação |
| `usecase/impl/` | Implementações dos casos de uso (`@Service`) |
| `dto/` | Objetos de transferência de dados (request/response) |
