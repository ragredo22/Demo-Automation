Feature: review incidents
  I want check out the incidents on USD, for the manage




  Scenario Outline: Manage incidents
    Given I ingreso URL
    When login e inscripcion
      | <userName> | <passWord> | <NitEmpre> | <IdPersonalizado> | <Documento> | <TipoDocumento> | <Nombre> | <Apellido> | <Fecha> | <Correo> | <Telefono> | <NewKey> | <ComfirmKey> | <UserType> |
    Then creo el usuario
    Examples:

      | userName | passWord         | NitEmpre | IdPersonalizado | Documento | TipoDocumento | Nombre | Apellido | Fecha | Correo | Telefono | NewKey | ComfirmKey | UserType |
      | ragredo  | JuanDavid270817* |          |                 |           |               |        |          |       |        |          |        |            |          |
