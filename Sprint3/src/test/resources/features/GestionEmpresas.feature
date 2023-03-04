Feature: The user can create a new operator company

  Background:
    Given The user enters to Neat administration page
    When He puts the superAdmin and the 1234567
    And He goes to the Operator company module


  @CrearEmpresaOperadora
  Scenario Outline: Actor can create a new operator company
    Given He goes to the Create operator company
    When He puts the data and complete the register
      | <NombreEmpresa> | <Nit> | <Correo> | <Representante> | <Telefono> |
    Then He sees the success message Éxitoso

    Examples:
    | NombreEmpresa | Nit | Correo | Representante | Telefono |
    | Empresa Prueba | 1234567 | EmpresaPrueba@gmail.com | Juan | 3219872090 |


    @CancelarEmpresaOpedora
    Scenario: Actor can cancel the operator company creation
      Given He goes to the Create operator company
      When He Cancel the action
      Then He sees the principal page of operator company module Gestión empresa operadora


    @BorrarDatosRegistro
    Scenario: Actor can clean the inputs in thr register page
      Given He goes to the Create operator company
      When He select the eraser icon
      Then He see all the inputs clean


    @FiltrarSinDatos
    Scenario: Actor can see all the operator company registers
      Given He select the filter button
      Then He see all the company operator register

    @FiltrarEmpresa
    Scenario: Actor filter a operator company
      Given The user puts information in the input filter No borrar esta empresa
      When He select the filter button
      Then He sees the same information that he puts in the inputs filter 809018762


    @LimpiarFiltros
    Scenario: Actor claen the filters
      Given The user puts information in the input filter dato
      When He select the filter button
      And He select the clean button
      Then He sees all the inputs filter clean


    @VerMasFiltros
    Scenario: Actor sees all the filter inputs
      Given He select more filters button
      Then He sees all the filters inputs Fecha inicio


    @DesactivarEmpresa
    Scenario: Actor can active a company
      Given He select the filter button
      When He active the operator company
      Then He sees the Inactivo status

    @ActivarEmpresa
    Scenario: Actor can inactive company
      Given He select the filter button
      When He inactive the operator company
      Then He sees the Activo status 2


    @EditarEmpresa
    Scenario: Actor can edit a company register
      Given He select the filter button
      When He select th edit button
      And He edit the operator company Gabriela
      Then He sees the secces message Éxitoso


    @CancelarEdicionEmpresa
    Scenario: Actor can cancel the company edition
      Given He select the filter button
      When He select th edit button
      And He cancel the action of edit
      Then He sees the principal page of the module









