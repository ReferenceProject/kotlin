package org.jetbrains.kotlin.fir.visitors

import org.jetbrains.kotlin.fir.declarations.*
import org.jetbrains.kotlin.fir.expressions.*
import org.jetbrains.kotlin.fir.*
import org.jetbrains.kotlin.fir.types.*


abstract class FirVisitorVoid : FirVisitor<Unit, Nothing?>() {
    abstract fun visitElement(element: FirElement)

    open fun visitDeclaration(declaration: FirDeclaration) {
        visitElement(declaration, null)
    }

    open fun visitCallableMember(callableMember: FirCallableMember) {
        visitDeclaration(callableMember, null)
    }

    open fun visitDeclarationWithBody(declarationWithBody: FirDeclarationWithBody) {
        visitDeclaration(declarationWithBody, null)
    }

    open fun visitAnonymousInitializer(anonymousInitializer: FirAnonymousInitializer) {
        visitDeclarationWithBody(anonymousInitializer, null)
    }

    open fun visitFunction(function: FirFunction) {
        visitDeclarationWithBody(function, null)
    }

    open fun visitConstructor(constructor: FirConstructor) {
        visitFunction(constructor, null)
    }

    open fun visitNamedFunction(namedFunction: FirNamedFunction) {
        visitFunction(namedFunction, null)
    }

    open fun visitPropertyAccessor(propertyAccessor: FirPropertyAccessor) {
        visitFunction(propertyAccessor, null)
    }

    open fun visitErrorDeclaration(errorDeclaration: FirErrorDeclaration) {
        visitDeclaration(errorDeclaration, null)
    }

    open fun visitNamedDeclaration(namedDeclaration: FirNamedDeclaration) {
        visitDeclaration(namedDeclaration, null)
    }

    open fun visitMemberDeclaration(memberDeclaration: FirMemberDeclaration) {
        visitNamedDeclaration(memberDeclaration, null)
    }

    open fun visitClass(klass: FirClass) {
        visitMemberDeclaration(klass, null)
    }

    open fun visitEnumEntry(enumEntry: FirEnumEntry) {
        visitClass(enumEntry, null)
    }

    open fun visitTypeAlias(typeAlias: FirTypeAlias) {
        visitMemberDeclaration(typeAlias, null)
    }

    open fun visitTypeParameter(typeParameter: FirTypeParameter) {
        visitNamedDeclaration(typeParameter, null)
    }

    open fun visitProperty(property: FirProperty) {
        visitDeclaration(property, null)
    }

    open fun visitTypedDeclaration(typedDeclaration: FirTypedDeclaration) {
        visitDeclaration(typedDeclaration, null)
    }

    open fun visitValueParameter(valueParameter: FirValueParameter) {
        visitDeclaration(valueParameter, null)
    }

    open fun visitVariable(variable: FirVariable) {
        visitDeclaration(variable, null)
    }

    open fun visitImport(import: FirImport) {
        visitElement(import, null)
    }

    open fun visitPackageFragment(packageFragment: FirPackageFragment) {
        visitElement(packageFragment, null)
    }

    open fun visitFile(file: FirFile) {
        visitPackageFragment(file, null)
    }

    open fun visitStatement(statement: FirStatement) {
        visitElement(statement, null)
    }

    open fun visitExpression(expression: FirExpression) {
        visitStatement(expression, null)
    }

    open fun visitBody(body: FirBody) {
        visitExpression(body, null)
    }

    open fun visitCall(call: FirCall) {
        visitExpression(call, null)
    }

    open fun visitAnnotationCall(annotationCall: FirAnnotationCall) {
        visitCall(annotationCall, null)
    }

    open fun visitConstructorCall(constructorCall: FirConstructorCall) {
        visitCall(constructorCall, null)
    }

    open fun visitType(type: FirType) {
        visitElement(type, null)
    }

    open fun visitDelegatedType(delegatedType: FirDelegatedType) {
        visitType(delegatedType, null)
    }

    open fun visitErrorType(errorType: FirErrorType) {
        visitType(errorType, null)
    }

    open fun visitImplicitType(implicitType: FirImplicitType) {
        visitType(implicitType, null)
    }

    open fun visitTypeWithNullability(typeWithNullability: FirTypeWithNullability) {
        visitType(typeWithNullability, null)
    }

    open fun visitDynamicType(dynamicType: FirDynamicType) {
        visitTypeWithNullability(dynamicType, null)
    }

    open fun visitFunctionType(functionType: FirFunctionType) {
        visitTypeWithNullability(functionType, null)
    }

    open fun visitResolvedType(resolvedType: FirResolvedType) {
        visitTypeWithNullability(resolvedType, null)
    }

    open fun visitUserType(userType: FirUserType) {
        visitTypeWithNullability(userType, null)
    }

    open fun visitTypeProjection(typeProjection: FirTypeProjection) {
        visitElement(typeProjection, null)
    }

    open fun visitStarProjection(starProjection: FirStarProjection) {
        visitTypeProjection(starProjection, null)
    }

    final override fun visitDeclarationWithBody(declarationWithBody: FirDeclarationWithBody, data: Nothing?) {
        visitDeclarationWithBody(declarationWithBody)
    }

    final override fun visitDeclaration(declaration: FirDeclaration, data: Nothing?) {
        visitDeclaration(declaration)
    }

    final override fun visitMemberDeclaration(memberDeclaration: FirMemberDeclaration, data: Nothing?) {
        visitMemberDeclaration(memberDeclaration)
    }

    final override fun visitFunction(function: FirFunction, data: Nothing?) {
        visitFunction(function)
    }

    final override fun visitElement(element: FirElement, data: Nothing?) {
        visitElement(element)
    }

    final override fun visitClass(klass: FirClass, data: Nothing?) {
        visitClass(klass)
    }

    final override fun visitPackageFragment(packageFragment: FirPackageFragment, data: Nothing?) {
        visitPackageFragment(packageFragment)
    }

    final override fun visitNamedDeclaration(namedDeclaration: FirNamedDeclaration, data: Nothing?) {
        visitNamedDeclaration(namedDeclaration)
    }

    final override fun visitCall(call: FirCall, data: Nothing?) {
        visitCall(call)
    }

    final override fun visitExpression(expression: FirExpression, data: Nothing?) {
        visitExpression(expression)
    }

    final override fun visitStatement(statement: FirStatement, data: Nothing?) {
        visitStatement(statement)
    }

    final override fun visitType(type: FirType, data: Nothing?) {
        visitType(type)
    }

    final override fun visitTypeWithNullability(typeWithNullability: FirTypeWithNullability, data: Nothing?) {
        visitTypeWithNullability(typeWithNullability)
    }

    final override fun visitTypeProjection(typeProjection: FirTypeProjection, data: Nothing?) {
        visitTypeProjection(typeProjection)
    }

}
